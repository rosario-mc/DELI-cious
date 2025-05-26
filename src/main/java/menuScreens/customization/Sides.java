package menuScreens.customization;

import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Sides implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich side = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                     _____                                 _____\s
                                    ( ___ )-------------------------------( ___ )
                                     |   |                                 |   |\s
                                     |   |  _____ ___________ _____ _____  |   |\s
                                     |   | /  ___|_   _|  _  \\  ___/  ___| |   |\s
                                     |   | \\ `--.  | | | | | | |__ \\ `--.  |   |\s
                                     |   |  `--. \\ | | | | | |  __| `--. \\ |   |\s
                                     |   | /\\__/ /_| |_| |/ /| |___/\\__/ / |   |\s
                                     |   | \\____/ \\___/|___/ \\____/\\____/  |   |\s
                                     |___|                                 |___|\s
                                    (_____)-------------------------------(_____)\s
                    ==============================================================================
                                     Please select your sides option from the following:
                    
                                                   1- Au Jus
                    
                                                   2- Sauce
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "AU JUS" -> side.getToppings();
                case "2", "SAUCE" -> side.getToppings();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}