package menuScreens.customization;

import sandwichComponents.PremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Cheese implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Cheese(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
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
                    ===========================================================
                                     Melt It, Layer It, Love It!
                                          1- American
                                          2- Provolone
                                          3- Cheddar
                                          4- Swiss
                                          5- Add Extra
                                          0- Done / Back
                                     Choose Your Cheese:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "AMERICAN" -> addCheese("American");
                case "2", "PROVOLONE" -> addCheese("Provolone");
                case "3", "CHEDDAR" -> addCheese("Cheddar");
                case "4", "SWISS" -> addCheese("Swiss");
                case "5", "ADD EXTRA", "EXTRA" -> sandwich.setHasExtraCheese(true);
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid Option. Please Try Again..");
            }
        }
    }

    private void addCheese(String cheeseName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new PremiumTopping(cheeseName, size, true, price));
    }

    private double getPriceBySize(String size) {
        return switch (size) {
            case "4" -> 0.75;
            case "8" -> 1.50;
            case "12" -> 2.25;
            default -> 0.0;
        };
    }
}
