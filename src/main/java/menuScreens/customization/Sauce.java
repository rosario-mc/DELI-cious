package menuScreens.customization;

import menuItems.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Sauce implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich sauce = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                    _____                                  _____\s
                                   ( ___ )--------------------------------( ___ )
                                    |   |                                  |   |\s
                                    |   |  _____  ___  _   _ _____  _____  |   |\s
                                    |   | /  ___|/ _ \\| | | /  __ \\|  ___| |   |\s
                                    |   | \\ `--./ /_\\ \\ | | | /  \\/| |__   |   |\s
                                    |   |  `--. \\  _  | | | | |    |  __|  |   |\s
                                    |   | /\\__/ / | | | |_| | \\__/\\| |___  |   |\s
                                    |   | \\____/\\_| |_/\\___/ \\____/\\____/  |   |\s
                                    |___|                                  |___|\s
                                   (_____)--------------------------------(_____)\s
                    ==============================================================================
                                     Please select your sauces option from the following:
                    
                                                   1- Mayo
                    
                                                   2- Mustard
                    
                                                   3- Ketchup
                    
                                                   4- Ranch
                                                   
                                                   5- Thousand Islands
                                                   
                                                   6- Vinaigrette
                                                   
                                                   7- Add Extra
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "MAYO" -> sauce.getToppings();
                case "2", "MUSTARD" -> sauce.getToppings();
                case "3", "KETCHUP" -> sauce.getToppings();
                case "4", "RANCH" -> sauce.getToppings();
                case "5", "THOUSAND ISLANDS" -> sauce.getToppings();
                case "6", "VINAIGRETTE" -> sauce.getToppings();
                case "7", "ADD EXTRA" -> sauce.getToppings();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}