package menuScreens;

import customerOrder.Order;
import customerOrder.ReceiptGenerator;

import java.util.Scanner;

public class Checkout implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Order order = new Order();
    ReceiptGenerator receipt = new ReceiptGenerator();

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
                                      Please select an option from the following:
                                                    1- Confirm
                    
                                                    2- Cancel
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "CONFIRM" -> {
                    receipt.printReceipt(order);
                    receipt.saveReceiptToFile(receipt.generateReceipt(order));
                }
                case "2", "CANCEL" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
