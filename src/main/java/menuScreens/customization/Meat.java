package menuScreens.customization;

import sandwichComponents.PremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Meat implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;
    Utils util;

    public Meat(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                           _____                                                     _____\s
                          ( ___ )---------------------------------------------------( ___ )
                           |   |                                                     |   |\s
                           |   |          ___  ___ _____  ___ _____ _____            |   |\s
                           |   |          |  \\/  ||  ___|/ _ \\_   _/  ___|           |   |\s
                           |   |          | .  . || |__ / /_\\ \\| | \\ `--.            |   |\s
                           |   |          | |\\/| ||  __||  _  || |  `--. \\           |   |\s
                           |   |          | |  | || |___| | | || | /\\__/ /           |   |\s
                           |   |          \\_|  |_/\\____/\\_| |_/\\_/ \\____/            |   |\s
                           |___|                                                     |___|\s
                          (_____)---------------------------------------------------(_____)\s
                    ==============================================================================
                                                   Stack The Meats Up!
                    
                                                       1- Steak
                                                       2- Ham
                                                       3- Salami
                                                       4- Roast Beef
                                                       5- Chicken
                                                       6- Bacon
                                                       7- Add Extra
                                                       0- Done / Back
                    
                                            Choose Your Protein Power:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "STEAK" -> {
                    addMeat("Steak");
                    run = false;
                }
                case "2", "HAM" -> {
                    addMeat("Ham");
                    run = false;
                }
                case "3", "SALAMI" -> {
                    addMeat("Salami");
                    run = false;
                }
                case "4", "ROAST BEEF" -> {
                    addMeat("Roast Beef");
                    run = false;
                }
                case "5", "CHICKEN" -> {
                    addMeat("Chicken");
                    run = false;
                }
                case "6", "BACON" ->{
                    addMeat("Bacon");
                    run = false;
                }
                case "7", "EXTRA" -> {
                    sandwich.setHasExtraMeat(true);
                    run = false;
                }
                case "0", "BACK", "DONE" -> run = false;
                default -> util.printCentered("Invalid option. Please try again.\n", 80);
            }
        }
    }

    private void addMeat(String meatName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new PremiumTopping(meatName, size));
        util.printCentered(meatName + " Added To Your Sando!\n", 80);
    }

    private double getPriceBySize(String size) {
        return switch (size) {
            case "4" -> 1.00;
            case "8" -> 2.00;
            case "12" -> 3.00;
            default -> 0.0;
        };
    }
}