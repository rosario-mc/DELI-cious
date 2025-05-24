package menuScreens.customization;

import menuScreens.DisplayScreens;

import java.util.Scanner;

public class SandwichCustomization implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Bread bread = new Bread();
    Size size = new Size();
    Topping topping = new Topping();
    Toast toast = new Toast();

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
                                                   
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "BREAD TYPE", "BREAD" -> bread.display();
                case "2", "SANDO SIZE", "SIZE" -> size.display();
                case "3", "TOPPINGS" -> topping.display();
                case "4", "TOAST MY SANDO", "TOAST" -> toast.display();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}