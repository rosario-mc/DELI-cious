package menuScreens;

import customerOrder.Order;
import menuScreens.customization.Utils;

import java.util.Scanner;

public class OrderScreen implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    TypeOfSandwich sandoType;
    Checkout checkout;
    Order currentOrder = new Order();
    Utils util;

    public OrderScreen() {
        sandoType = new TypeOfSandwich(currentOrder);
        checkout = new Checkout(currentOrder);
    }

    public void getInfo() {
        String menu = """
                    \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
                    _____                            _____\s
                   ( ___ )--------------------------( ___ )
                    |   |                            |   |\s
                    |   |  _____ _   _ ______ _____  |   |\s
                    |   | |_   _| \\ | ||  ___|  _  | |   |\s
                    |   |   | | |  \\| || |_  | | | | |   |\s
                    |   |   | | | . ` ||  _| | | | | |   |\s
                    |   |  _| |_| |\\  || |   \\ \\_/ / |   |\s
                    |   |  \\___/\\_| \\_/\\_|    \\___/  |   |\s
                    |___|                            |___|\s
                   (_____)--------------------------(_____)\s
                ===============================================
                              Let's Get Started!
                         Please Enter Your Name:\s""";
        System.out.print(menu);
        String name = input.nextLine();
        currentOrder.setOrderName(name);
        util.printCentered("Thanks, " + name + "!\n", 50);
        util.printCentered("Let 's Continue To Building Your Order!\n", 50);
        util.printCentered("Press Enter To Continue!\n", 50);
        input.nextLine();
        display();
    }


    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                         \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
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
                    ======================================================
                          What would you like to add to your feast?
                                       1- Add Sando
                                       2- Add Drink
                                       3- Add Chips
                                       4- Checkout
                                       0- Cancel Order
                                      Your Choice:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "ADD SANDWICH", "SANDWICH", "ADD SANDO", "SANDO" -> sandoType.display();
                //case "2", "ADD DRINK", "DRINK" ->
                //case "3", "ADD CHIPS", "CHIPS" ->
                case "4", "CHECKOUT" -> checkout.display();
                case "0", "CANCEL ORDER", "CANCEL" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\n".repeat(50));
    }
}
