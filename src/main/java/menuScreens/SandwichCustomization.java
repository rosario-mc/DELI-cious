package menuScreens;

import java.util.Scanner;

public class SandwichCustomization implements DisplayScreens {
    static Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
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
                    ==============================================================================
                               Please select an option from the following to build your Sando:
                    
                                                   1- Bread Type
                    
                                                   2- Sando Size
                    
                                                   3- Toppings
                    
                                                   4- Toast My Sando
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                /*case "1", "BREAD TYPE", "BREAD" ->
                case "2", "SANDO SIZE", "SIZE" ->
                case "3", "TOPPINGS" ->
                case "4", "TOAST MY SANDO", "TOAST" ->
                 */
                case "0", "CANCEL ORDER", "CANCEL" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}