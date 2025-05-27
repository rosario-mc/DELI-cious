package menuScreens;

import customerOrder.Order;
import customerOrder.ReceiptGenerator;

import java.util.Scanner;

public class Checkout implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Order order;
    private ReceiptGenerator generator = new ReceiptGenerator();

    public Checkout(Order order) {
        this.order = order;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                            _____                                                      _____\s
                           ( ___ )----------------------------------------------------( ___ )
                            |   |                                                      |   |\s
                            |   |  _____  _   _  _____ _____  _   _______ _   _ _____  |   |\s
                            |   | /  __ \\| | | ||  ___/  __ \\| | / /  _  | | | |_   _| |   |\s
                            |   | | /  \\/| |_| || |__ | /  \\/| |/ /| | | | | | | | |   |   |\s
                            |   | | |    |  _  ||  __|| |    |    \\| | | | | | | | |   |   |\s
                            |   | | \\__/\\| | | || |___| \\__/\\| |\\  \\ \\_/ / |_| | | |   |   |\s
                            |   |  \\____/\\_| |_/\\____/ \\____/\\_| \\_/\\___/ \\___/  \\_/   |   |\s
                            |___|                                                      |___|\s
                           (_____)----------------------------------------------------(_____)\s
                    ==============================================================================
                                                   Ready To Eat?
                                                  1- Review Order
                                                  2- Cancel Order
                                                   Your Choice:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "CONFIRM" -> {
                    String receiptText = generator.generateReceipt(order);
                    generator.printReceipt(order);
                    generator.saveReceiptToFile(receiptText);
                }
                case "2", "CANCEL" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
