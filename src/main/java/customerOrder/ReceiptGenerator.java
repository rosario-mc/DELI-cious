package customerOrder;

import sandwichComponents.CustomizableItem;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptGenerator {

    public String generateReceipt(Order order) {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Name: ").append(order.getOrderName()).append("\n");
        sb.append("Order ID: ").append(order.getOrderID()).append("\n");
        sb.append("Order Date: ").append(order.getOrderDate()).append("\n");

        appendItemList("Sandwiches", order.getSandwiches(), sb);
        appendItemList("Drinks", order.getDrinks(), sb);
        appendItemList("Chips", order.getChips(), sb);

        sb.append("Total: ").append(order.getTotalPrice()).append("\n");
        return sb.toString();
    }

    public void printReceipt(Order order){
        System.out.println(generateReceipt(order));
    }

    public void saveReceiptToFile(String receiptText){
        File folder = new File("receipts");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        File receiptFile = new File(folder, timestamp + ".txt");

        try (PrintWriter writer = new PrintWriter(receiptFile)) {
            writer.println(receiptText);
        } catch (IOException e) {
            System.out.println("An Error Occurred While Saving Receipt: " + e.getMessage());
        }
    }

    //UTIL
    private <T extends CustomizableItem> void appendItemList(String label, List<T> items, StringBuilder sb) {
        sb.append(label).append(":\n");
        for (T item : items) {
            sb.append("  - ").append(item.toString()).append("\n");
        }
    }
}