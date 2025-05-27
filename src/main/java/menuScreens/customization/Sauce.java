package menuScreens.customization;

import sandwichComponents.NonPremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Sauce implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Sauce(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

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
                                                  Let’s Get Saucy!
                                                    1- Mayo
                                                    2- Mustard
                                                    3- Ketchup
                                                    4- Ranch
                                                    5- Thousand Islands
                                                    6- Vinaigrette
                                                    7- Add Extra
                                                    0- Back
                                             Pick Your Perfect Drizzle:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "MAYO" -> addSauce("Mayo");
                case "2", "MUSTARD" -> addSauce("Mustard");
                case "3", "KETCHUP" -> addSauce("Ketchup");
                case "4", "RANCH" -> addSauce("Ranch");
                case "5", "THOUSAND ISLANDS" -> addSauce("Thousand Islands");
                case "6", "VINAIGRETTE" -> addSauce("Vinaigrette");
                case "7", "ADD EXTRA" -> addSauce("Extra Sauce");
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }
    private void addSauce(String sauceName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new NonPremiumTopping(sauceName, size, true, price));
        System.out.println(sauceName + " Added To Your Sando (" + size + "\", $" + price + ").");
    }
    private double getPriceBySize(String size) {
        return 0.0;
    }
}