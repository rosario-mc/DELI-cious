package menuScreens;

import customerOrder.Order;
import menuScreens.customization.SandwichCustomization;
import sandwichComponents.Sandwich;

import java.util.Scanner;

public class TypeOfSandwich implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    SandwichCustomization sando = new SandwichCustomization();
    private Order order;



    public TypeOfSandwich(Order order) {
        this.order = order;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                         \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
                         _____                                  _____\s
                        ( ___ )--------------------------------( ___ )
                         |   |                                  |   |\s
                         |   |  _____  ___   _   _______ _____  |   |\s
                         |   | /  ___|/ _ \\ | \\ | |  _  \\  _  | |   |\s
                         |   | \\ `--./ /_\\ \\|  \\| | | | | | | | |   |\s
                         |   |  `--. \\  _  || . ` | | | | | | | |   |\s
                         |   | /\\__/ / | | || |\\  | |/ /\\ \\_/ / |   |\s
                         |   | \\____/\\_| |_/\\_| \\_/___/  \\___/  |   |\s
                         |___|                                  |___|\s
                        (_____)--------------------------------(_____)\s
                    ========================================================
                     Let’s get this flavor party started! What sounds good?
                                      1- Signature Sandos
                                      2- Build My Own Sando
                                      0- Back
                                      Your Choice:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                //case "1", "SIGNATURE SANDOS" -> bread.display();
                case "2", "BUILD MY OWN SANDO" -> {
                    Sandwich builtSandwich = sando.display();
                    order.addSandwich(builtSandwich);
                    System.out.println("Sando Added To Your Order!");
                }
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }
}