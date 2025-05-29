package menuScreens.customization;

import menuScreens.DisplayScreens;
import sandwichComponents.Sandwich;

import java.util.Scanner;

public class Topping implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;
    Utils util;

    private Meat meat;
    private Cheese cheese;
    private Veggies veg;
    private Sauce sauce;
    private Side side;

    public Topping(Sandwich sandwich) {
        this.sandwich = sandwich;
        this.meat = new Meat(sandwich);
        this.cheese = new Cheese(sandwich);
        this.veg = new Veggies(sandwich);
        this.sauce = new Sauce(sandwich);
        this.side = new Side(sandwich);
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                           _____                                                       _____\s
                          ( ___ )-----------------------------------------------------( ___ )
                           |   |                                                       |   |\s
                           |   |   _____ _________________ _____ _   _ _____  _____    |   |\s
                           |   |  |_   _|  _  | ___ \\ ___ \\_   _| \\ | |  __ \\/  ___|   |   |\s
                           |   |    | | | | | | |_/ / |_/ / | | |  \\| | |  \\/\\ `--.    |   |\s
                           |   |    | | | | | |  __/|  __/  | | | . ` | | __  `--. \\   |   |\s
                           |   |    | | \\ \\_/ / |   | |    _| |_| |\\  | |_\\ \\/\\__/ /   |   |\s
                           |   |    \\_/  \\___/\\_|   \\_|    \\___/\\_| \\_/\\____/\\____/    |   |\s
                           |___|                                                       |___|\s
                          (_____)-----------------------------------------------------(_____)\s
                    ==============================================================================
                                             More flavor? Coming right up!
                                                
                                                     1- Meat
                                                     2- Cheese
                                                     3- Veggies
                                                     4- Sauce
                                                     5- Sides
                                                     0- Done
                                                     
                                             Choose your toppings:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "MEAT" -> meat.display();
                case "2", "CHEESE" -> cheese.display();
                case "3", "VEGGIES" -> veg.display();
                case "4", "SAUCES" -> sauce.display();
                case "5", "SIDES" -> side.display();
                case "0", "BACK" -> run = false;
                default -> util.printCentered("Invalid Option. Please Try Again.\n", 80);
            }
        }
    }
}