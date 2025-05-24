package menuScreens.customization;

import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Topping implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Meat meat = new Meat();
    Cheese cheese = new Cheese();
    Veggies veg = new Veggies();
    Sauce sauce = new Sauce();
    Sides side = new Sides();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                           _____                                                    _____\s
                          ( ___ )--------------------------------------------------( ___ )
                           |   |                                                    |   |\s
                           |   |  _____ _________________ _____ _   _ _____  _____  |   |\s
                           |   | |_   _|  _  | ___ \\ ___ \\_   _| \\ | |  __ \\/  ___| |   |\s
                           |   |   | | | | | | |_/ / |_/ / | | |  \\| | |  \\/\\ `--.  |   |\s
                           |   |   | | | | | |  __/|  __/  | | | . ` | | __  `--. \\ |   |\s
                           |   |   | | \\ \\_/ / |   | |    _| |_| |\\  | |_\\ \\/\\__/ / |   |\s
                           |   |   \\_/  \\___/\\_|   \\_|    \\___/\\_| \\_/\\____/\\____/  |   |\s
                           |___|                                                    |___|\s
                          (_____)--------------------------------------------------(_____)\s
                    ==============================================================================
                              Please select the toppings you'd like from the following:
                    
                                                  1- Meat
                    
                                                  2- Cheese
                    
                                                  3- Veggies
                    
                                                  4- Sauce
                                                  
                                                  5- Sides
                                                  
                                                  0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "MEAT" -> meat.display();
                case "2", "CHEESE" -> cheese.display();
                case "3", "VEGGIES" -> veg.display();
                case "4", "SAUCES" -> sauce.display();
                case "5", "SIDES" -> side.display();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
