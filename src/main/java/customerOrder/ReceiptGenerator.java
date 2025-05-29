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
        System.out.println("==============================================================================");
        StringBuilder sb = new StringBuilder();
        sb.append("Give Us Feedback @ survey.DELI-ciousSandos.com\n");
        sb.append("Thank You For Your Trusting Us To Make Your Sandos!\n\n");
        sb.append("DELI-cious Sandos Receipt\n\n");
        sb.append("Order Name: ").append(order.getOrderName()).append("\n");
        sb.append("Order ID: ").append(order.getOrderID()).append("\n");
        DateTimeFormatter receiptFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        LocalDateTime now = LocalDateTime.now();
        sb.append("Order Date: ").append(now.format(receiptFormatter)).append("\n\n");

        double total = 0.0;

        total += appendItemList("Drinks", order.getDrinks(), sb);
        total += appendItemList("Chips", order.getChips(), sb);
        total += appendItemList("Sandwiches", order.getSandwiches(), sb);

        sb.append("\nTotal Price: $").append(String.format("%.2f", total)).append("\n");

        return sb.toString();
    }

    public void printReceipt(Order order) {
        System.out.println(generateReceipt(order));
    }

    public void saveReceiptToFile(String receiptText) {
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
    private <T extends CustomizableItem> double appendItemList(String label, List<T> items, StringBuilder sb) {
        sb.append(label).append(":\n");
        double subtotal = 0.0;
        for (T item : items) {
            sb.append("  - ").append(item.toString()).append("\n");
            subtotal += item.calculatePrice();
        }
        return subtotal;
    }
}