package menuScreens.customization;

import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Cheese implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich cheese = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                _____                                         _____\s
                               ( ___ )---------------------------------------( ___ )
                                |   |                                         |   |\s
                                |   |  _____  _   _  _____ _____ _____ _____  |   |\s
                                |   | /  __ \\| | | ||  ___|  ___/  ___|  ___| |   |\s
                                |   | | /  \\/| |_| || |__ | |__ \\ `--.| |__   |   |\s
                                |   | | |    |  _  ||  __||  __| `--. \\  __|  |   |\s
                                |   | | \\__/\\| | | || |___| |___/\\__/ / |___  |   |\s
                                |   |  \\____/\\_| |_/\\____/\\____/\\____/\\____/  |   |\s
                                |___|                                         |___|\s
                               (_____)---------------------------------------(_____)\s
                    ==============================================================================
                                   Please select a cheese option from the following:
                    
                                                   1- American
                    
                                                   2- Provolone
                    
                                                   3- Cheddar
                    
                                                   4- Swiss
                    
                                                   5- Add Extra
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "AMERICAN" -> cheese.getToppings();
                case "2", "PROVOLONE" -> cheese.getToppings();
                case "3", "CHEDDAR" -> cheese.getToppings();
                case "4", "SWISS" -> cheese.getToppings();
                case "5", "ADD EXTRA", "EXTRA" -> cheese.getToppings();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
