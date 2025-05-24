package menuScreens.customization;

import menuItems.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Veggies implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich veg = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                _____                                             _____\s
                               ( ___ )-------------------------------------------( ___ )
                                |   |                                             |   |\s
                                |   |  _   _ _____ _____ _____ _____ _____ _____  |   |\s
                                |   | | | | |  ___|  __ \\  __ \\_   _|  ___/  ___| |   |\s
                                |   | | | | | |__ | |  \\/ |  \\/ | | | |__ \\ `--.  |   |\s
                                |   | | | | |  __|| | __| | __  | | |  __| `--. \\ |   |\s
                                |   | \\ \\_/ / |___| |_\\ \\ |_\\ \\_| |_| |___/\\__/ / |   |\s
                                |   |  \\___/\\____/ \\____/\\____/\\___/\\____/\\____/  |   |\s
                                |___|                                             |___|\s
                               (_____)-------------------------------------------(_____)\s
                    ==============================================================================
                                   Please select your veggies options from the following:
                    
                                                   1- Lettuce
                    
                                                   2- Peppers
                    
                                                   3- Onions
                    
                                                   4- Tomatoes
                                                   
                                                   5- Jalapeños
                    
                                                   6- Cucumbers
                    
                                                   7- Pickles
                    
                                                   8- Guacamole
                                                   
                                                   9- Mushrooms
                                                   
                                                   10- Add Extra
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "LETTUCE" -> veg.getToppings();
                case "2", "PEPPERS" -> veg.getToppings();
                case "3", "ONIONS" -> veg.getToppings();
                case "4", "TOMATOES" -> veg.getToppings();
                case "5", "JALAPEÑOS" -> veg.getToppings();
                case "6", "CUCUMBERS" -> veg.getToppings();
                case "7", "PICKLES" -> veg.getToppings();
                case "8", "GUACAMOLE" -> veg.getToppings();
                case "9", "MUSHROOMS" -> veg.getToppings();
                case "10", "ADD EXTRA", "EXTRA" -> veg.getToppings();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}