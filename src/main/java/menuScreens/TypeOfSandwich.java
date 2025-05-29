package menuScreens;

import customerOrder.Order;
import menuScreens.customization.SandwichCustomization;
import menuScreens.customization.Utils;
import sandwichComponents.BLT;
import sandwichComponents.PhillyCheeseSteak;
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
                case "1", "SIGNATURE SANDOS" -> signatureSandoSelection();
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
                default -> util.printCentered("Invalid Option. Please Try Again.\n", 80);
            }
        }
    }

    public void signatureSandoSelection(){
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                        _____                                                          _____\s
                       ( ___ )--------------------------------------------------------( ___ )
                        |   |                                                          |   |\s
                        |   |  _____ _____ _____  _   _   ___ _____ _   _______ _____  |   |\s
                        |   | /  ___|_   _|  __ \\| \\ | | / _ \\_   _| | | | ___ \\  ___| |   |\s
                        |   | \\ `--.  | | | |  \\/|  \\| |/ /_\\ \\| | | | | | |_/ / |__   |   |\s
                        |   |  `--. \\ | | | | __ | . ` ||  _  || | | | | |    /|  __|  |   |\s
                        |   | /\\__/ /_| |_| |_\\ \\| |\\  || | | || | | |_| | |\\ \\| |___  |   |\s
                        |   | \\____/ \\___/ \\____/\\_| \\_/\\_| |_/\\_/  \\___/\\_| \\_\\____/  |   |\s
                        |   |                                                          |   |\s
                        |   |                                                          |   |\s
                        |   |             _____  ___   _   _______ _____               |   |\s
                        |   |            /  ___|/ _ \\ | \\ | |  _  \\  _  |              |   |\s
                        |   |            \\ `--./ /_\\ \\|  \\| | | | | | | |              |   |\s
                        |   |             `--. \\  _  || . ` | | | | | | |              |   |\s
                        |   |            /\\__/ / | | || |\\  | |/ /\\ \\_/ /              |   |\s
                        |   |            \\____/\\_| |_/\\_| \\_/___/  \\___/               |   |\s
                        |___|                                                          |___|\s
                       (_____)--------------------------------------------------------(_____)
                    ==============================================================================
                      Your Sandwich Journey Starts Here! Which Mouthwatering Option Will You Pick?
                    
                                                     1- BLT
                                                     2- Philly Cheese Steak
                                                     0- Back
                    
                                                   Your Choice:\s""";
            System.out.print(menu);
            String sandoChoice = input.nextLine().trim();

            Sandwich selectedSando = switch (sandoChoice) {
                case "1" -> new BLT();
                case "2" -> new PhillyCheeseSteak();
                case "0" -> {
                    run = false;
                    yield null;
                }
                default -> {
                    util.printCentered("Invalid Option. Try Again.\n", 80);
                    yield null;
                }
            };

            if (selectedSando != null) {

                util.printCentered("Would You Like To Customize This Sando? (Y/N): ", 80);
                String customize = input.nextLine().trim().toUpperCase();

                if (customize.equals("Y")) {
                    selectedSando = sando.customizeExistingSandwich(selectedSando);
                }

                order.addSandwich(selectedSando);
                util.printCentered("Sando Added To Your Order!\n", 80);
                run = false;
            }
        }
    }
}