package menuScreens.customization;

import sandwichComponents.NonPremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Sauce implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;
    Utils util;

    public Sauce(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean selecting = true;
        while (selecting) {
            System.out.println("""
                    ==============================================================================
                     _____                                                                  _____\s
                    ( ___ )----------------------------------------------------------------( ___ )
                     |   |                                                                  |   |\s
                     |   |               _____  ___  _   _ _____  _____ _____               |   |\s
                     |   |              /  ___|/ _ \\| | | /  __ \\|  ___/  ___|              |   |\s
                     |   |              \\ `--./ /_\\ \\ | | | /  \\/| |__ \\ `--.               |   |\s
                     |   |               `--. \\  _  | | | | |    |  __| `--. \\              |   |\s
                     |   |              /\\__/ / | | | |_| | \\__/\\| |___/\\__/ /              |   |\s
                     |   |              \\____/\\_| |_/\\___/ \\____/\\____/\\____/               |   |\s
                     |___|                                                                  |___|\s
                    (_____)----------------------------------------------------------------(_____)\s
                    ==============================================================================
                                                   Let’s Get Saucy!
                    
                                                       1- Mayo
                                                       2- Mustard
                                                       3- Ketchup
                                                       4- Ranch
                                                       5- Thousand Islands
                                                       6- Vinaigrette
                                                       7- Add Extra
                                                       0- Done Choosing Sauces
                    
                                          (Separate By Comma, If Choosing Multiple)""");
            util.printCentered("Pick Your Perfect Drizzle:\s", 80);
            String inputLine = input.nextLine();
            String[] choices = inputLine.split("\\s*,\\s*");

            for (String choice : choices) {
                choice = choice.toUpperCase().trim();

                switch (choice) {
                    case "1", "MAYO" -> {
                        addSauce("Mayo");
                        selecting = false;
                    }
                    case "2", "MUSTARD" -> {
                        addSauce("Mustard");
                        selecting = false;
                    }
                    case "3", "KETCHUP" -> {
                        addSauce("Ketchup");
                        selecting = false;
                    }
                    case "4", "RANCH" -> {
                        addSauce("Ranch");
                        selecting = false;
                    }
                    case "5", "THOUSAND ISLANDS" -> {
                        addSauce("Thousand Islands");
                        selecting = false;
                    }
                    case "6", "VINAIGRETTE" -> {
                        addSauce("Vinaigrette");
                        selecting = false;
                    }
                    case "7", "ADD EXTRA" -> {
                        addSauce("Extra Sauce");
                        selecting = false;
                    }
                    case "0", "DONE" -> selecting = false;
                    default -> util.printCentered("Invalid option. Please try again.", 80);
                }
                if (!selecting) break;
            }
        }
    }

    private void addSauce(String sauceName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new NonPremiumTopping(sauceName, size, true, price));
        util.printCentered(sauceName + " Added To Your Sando!\n", 80);
    }

    private double getPriceBySize(String size) {
        return 0.0;
    }
}