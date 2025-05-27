package menuScreens.customization;

import sandwichComponents.PremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Meat implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Meat(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
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
                    ==============================================
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
                case "1", "STEAK" -> addMeat("Steak");
                case "2", "HAM" -> addMeat("Ham");
                case "3", "BACON" -> addMeat("Bacon");
                case "4", "CHICKEN" -> addMeat("Chicken");
                case "5", "ROAST BEEF" -> addMeat("Roast Beef");
                case "7", "EXTRA" -> sandwich.setHasExtraMeat(true);
                case "0", "BACK", "DONE" -> run = false;
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }

    private void addMeat(String meatName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new PremiumTopping(meatName, size, true, price));
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