package menuScreens;

import customerOrder.Order;
import menuScreens.customization.SandwichCustomization;
import menuScreens.customization.Utils;
import sandwichComponents.Sandwich;

import java.util.Scanner;

public class TypeOfSandwich implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    SandwichCustomization sando = new SandwichCustomization();
    private Order order;
    Utils util;


    public TypeOfSandwich(Order order) {
        this.order = order;
        this.util = new Utils();
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                        _____                                                             _____\s
                       ( ___ )-----------------------------------------------------------( ___ )
                        |   |                                                             |   |\s
                        |   |               _____  ___   _   _______ _____                |   |\s
                        |   |              /  ___|/ _ \\ | \\ | |  _  \\  _  |               |   |\s
                        |   |              \\ `--./ /_\\ \\|  \\| | | | | | | |               |   |\s
                        |   |               `--. \\  _  || . ` | | | | | | |               |   |\s
                        |   |              /\\__/ / | | || |\\  | |/ /\\ \\_/ /               |   |\s
                        |   |              \\____/\\_| |_/\\_| \\_/___/  \\___/                |   |\s
                        |___|                                                             |___|\s
                       (_____)-----------------------------------------------------------(_____)\s
                    ==============================================================================
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
                    boolean addingMore = true;
                    while (addingMore) {
                        Sandwich builtSandwich = sando.display();
                        order.addSandwich(builtSandwich);
                        util.printCentered("Sando Added To Your Order!\n", 80);

                        util.printCentered("One Sando Down! Hungry For Another? (Y/N):\s", 80);
                        String response = input.nextLine().trim().toUpperCase();

                        if (!response.equals("Y")) {
                            addingMore = false;
                        }
                    }
                }
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }
}