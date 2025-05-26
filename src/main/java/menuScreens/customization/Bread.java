package menuScreens.customization;

import sandwichComponents.PremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Bread implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Bread(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                      _____                                 _____\s
                                     ( ___ )-------------------------------( ___ )
                                      |   |                                 |   |\s
                                      |   | ____________ _____  ___ ______  |   |\s
                                      |   | | ___ \\ ___ \\  ___|/ _ \\|  _  \\ |   |\s
                                      |   | | |_/ / |_/ / |__ / /_\\ \\ | | | |   |\s
                                      |   | | ___ \\    /|  __||  _  | | | | |   |\s
                                      |   | | |_/ / |\\ \\| |___| | | | |/ /  |   |\s
                                      |   | \\____/\\_| \\_\\____/\\_| |_/___/   |   |\s
                                      |___|                                 |___|\s
                                     (_____)-------------------------------(_____)\s
                    ==============================================================================
                                                  Bread Options:
                                                      1- White
                                                      2- Wheat
                                                      3- Rye
                                                      4- Wrap
                                                      0- Back
                              Every masterpiece starts with a solid base — pick your bread:
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "WHITE" -> {
                    addBread("White");
                    run = false;
                }
                case "2", "WHEAT" -> {
                   addBread("Wheat");
                    run = false;
                }
                case "3", "RYE" -> {
                   addBread("Rye");
                    run = false;
                }
                case "4", "WRAP" -> {
                   addBread("Wrap");
                    run = false;
                }
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addBread(String breadName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new PremiumTopping(breadName, size, true, price));
        System.out.println(breadName + " Added To Your Sando (" + size + "\", $" + price + ").");
    }

    private double getPriceBySize(String size) {
        return switch (size) {
            case "4" -> 5.50;
            case "8" -> 7.00;
            case "12" -> 8.50;
            default -> 0.0;
        };
    }
}
