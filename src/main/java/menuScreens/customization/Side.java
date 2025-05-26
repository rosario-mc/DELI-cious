package menuScreens.customization;

import sandwichComponents.NonPremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Side implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Side(Sandwich sandwich) {
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
                                     |   |  _____ ___________ _____ _____  |   |\s
                                     |   | /  ___|_   _|  _  \\  ___/  ___| |   |\s
                                     |   | \\ `--.  | | | | | | |__ \\ `--.  |   |\s
                                     |   |  `--. \\ | | | | | |  __| `--. \\ |   |\s
                                     |   | /\\__/ /_| |_| |/ /| |___/\\__/ / |   |\s
                                     |   | \\____/ \\___/|___/ \\____/\\____/  |   |\s
                                     |___|                                 |___|\s
                                    (_____)-------------------------------(_____)\s
                    ==============================================================================
                                     Give your sando some backup — choose your sides:
                    
                                                   1- Au Jus
                    
                                                   2- Sauce
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "AU JUS" -> addSides("Au Jus");
                case "2", "SAUCE" -> addSides("Sauce");
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addSides(String sideName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new NonPremiumTopping(sideName, size, true, price));
        System.out.println(sideName + " Added To Your Sando (" + size + "\", $" + price + ").");
    }
    private double getPriceBySize(String size) {
        return 0.0;
    }
}