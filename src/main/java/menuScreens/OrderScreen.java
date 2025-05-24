package menuScreens;

import menuScreens.customization.SandwichCustomization;

import java.util.Scanner;

public class OrderScreen implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    SandwichCustomization sandwich = new SandwichCustomization();
    Checkout checkout = new Checkout();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                     _____                                 _____\s
                                    ( ___ )-------------------------------( ___ )
                                     |   |                                 |   |\s
                                     |   |  _________________ ___________  |   |\s
                                     |   | |  _  | ___ \\  _  \\  ___| ___ \\ |   |\s
                                     |   | | | | | |_/ / | | | |__ | |_/ / |   |\s
                                     |   | | | | |    /| | | |  __||    /  |   |\s
                                     |   | \\ \\_/ / |\\ \\| |/ /| |___| |\\ \\  |   |\s
                                     |   |  \\___/\\_| \\_|___/ \\____/\\_| \\_| |   |\s
                                     |___|                                 |___|\s
                                    (_____)-------------------------------(_____)\s
                    ==============================================================================
                                     Please select an option from the following:
                    
                                                   1- Add Sando
                  
                                                   2- Add Drink
                    
                                                   3- Add Chips
                    
                                                   4- Checkout
                    
                                                   0- Cancel Order
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "ADD SANDWICH", "SANDWICH", "ADD SANDO", "SANDO" -> sandwich.display();
                //case "2", "ADD DRINK", "DRINK" ->
                //case "3", "ADD CHIPS", "CHIPS" ->
                case "4", "CHECKOUT" -> checkout.display();
                case "0", "CANCEL ORDER", "CANCEL" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
