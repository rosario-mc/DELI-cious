package menuScreens;

import customerOrder.Order;

import java.util.Scanner;

public class OrderScreen implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    TypeOfSandwich sandoType;
    Checkout checkout;
    Order currentOrder = new Order();

    public OrderScreen() {
        sandoType = new TypeOfSandwich(currentOrder);
        checkout = new Checkout(currentOrder);
    }

    public void getInfo() {
        boolean inputtingInfo = true;
        while (inputtingInfo) {
            String menu = """
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
                    ==============================================================================
                                                   Let's Get Started!
                                                    1 -Enter Your Name
                                                    2- Continue To Order
                                                    3- Cancel\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "ENTER YOUR NAME" -> {
                    System.out.print("Please enter your name: ");
                    String name = input.nextLine();
                    currentOrder.setOrderName(name);
                    System.out.println("Thanks, " + name + "!");
                }
                case "2", "CONTINUE TO ORDER", "ORDER" -> {
                    display();
                    inputtingInfo = false;
                }
                case "3", "CANCEL" -> {
                    System.out.println("Order canceled. See you next time!");
                    inputtingInfo = false;
                }
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }


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
}
