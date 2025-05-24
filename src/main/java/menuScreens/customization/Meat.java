package menuScreens.customization;

import menuItems.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Meat implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich meat = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                       _____                            _____\s
                                      ( ___ )--------------------------( ___ )
                                       |   |                            |   |\s
                                       |   | ___  ___ _____  ___ _____  |   |\s
                                       |   | |  \\/  ||  ___|/ _ \\_   _| |   |\s
                                       |   | | .  . || |__ / /_\\ \\| |   |   |\s
                                       |   | | |\\/| ||  __||  _  || |   |   |\s
                                       |   | | |  | || |___| | | || |   |   |\s
                                       |   | \\_|  |_/\\____/\\_| |_/\\_/   |   |\s
                                       |___|                            |___|\s
                                      (_____)--------------------------(_____)\s
                    ==============================================================================
                                     Please select your meat option from the following:
                    
                                                   1- Steak
                    
                                                   2- Ham
                    
                                                   3- Salami
                    
                                                   4- Roast Beef
                    
                                                   5- Chicken
                    
                                                   6- Bacon
                    
                                                   7- Add Extra
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "STEAK" -> meat.getToppings();
                case "2", "HAM" -> meat.getToppings();
                case "3", "SALAMI" -> meat.getToppings();
                case "4", "ROAST BEEF" -> meat.getToppings();
                case "5", "CHICKEN" -> meat.getToppings();
                case "6", "BACON" -> meat.getToppings();
                case "7", "ADD EXTRA", "EXTRA" -> meat.getToppings();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
