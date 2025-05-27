package menuScreens.customization;

import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Size implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Size(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                         _____                            _____\s
                                        ( ___ )--------------------------( ___ )
                                         |   |                            |   |\s
                                         |   |  _____ _____ ______ _____  |   |\s
                                         |   | /  ___|_   _|___  /|  ___| |   |\s
                                         |   | \\ `--.  | |    / / | |__   |   |\s
                                         |   |  `--. \\ | |   / /  |  __|  |   |\s
                                         |   | /\\__/ /_| |_./ /___| |___  |   |\s
                                         |   | \\____/ \\___/\\_____/\\____/  |   |\s
                                         |___|                            |___|\s
                                        (_____)--------------------------(_____)\s
                    ==============================================================================
                                                What’s Your Hunger Level?
                                                   1- (Small) 4"
                                                   2- (Medium) 8"
                                                   3- (Large) 12"
                                                   0- Back
                                                  Size Up Your Sando:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "SMALL", "4" -> {
                    sandwich.setSandoSize("4");
                    sandwich.setBasePrice(getPriceBySize("4"));
                    run = false;
                }
                case "2", "MEDIUM", "8" -> {
                    sandwich.setSandoSize("8");
                    sandwich.setBasePrice(getPriceBySize("8"));
                    run = false;
                }
                case "3", "LARGE", "12" -> {
                    sandwich.setSandoSize("12");
                    sandwich.setBasePrice(getPriceBySize("12"));
                    run = false;
                }
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
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
