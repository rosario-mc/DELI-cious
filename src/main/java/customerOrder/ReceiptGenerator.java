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
        sb.append("ORDER NAME: ").append(order.getOrderName()).append("\n");
        sb.append("ORDER ID: ").append(order.getOrderID()).append("\n");
        sb.append("ORDER DATE: ").append(order.getOrderDate()).append("\n");

        appendItemList("SANDWICHES", order.getSandwiches(), sb);
        appendItemList("DRINKS", order.getDrinks(), sb);
        appendItemList("CHIPS", order.getChips(), sb);

        sb.append("TOTAL: ").append(order.getTotalPrice()).append("\n");
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
            System.out.println("AN ERROR OCCURRED WHILE SAVING RECEIPT: " + e.getMessage());
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