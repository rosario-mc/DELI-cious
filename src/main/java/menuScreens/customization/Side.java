package menuScreens.customization;

import sandwichComponents.NonPremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Side implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;
    Utils util;

    public Side(Sandwich sandwich) {
        this.sandwich = sandwich;
        this.util = new Utils();
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                        _____                                                           _____\s
                       ( ___ )---------------------------------------------------------( ___ )
                        |   |                                                           |   |\s
                        |   |               _____ ___________ _____ _____               |   |\s
                        |   |              /  ___|_   _|  _  \\  ___/  ___|              |   |\s
                        |   |              \\ `--.  | | | | | | |__ \\ `--.               |   |\s
                        |   |               `--. \\ | | | | | |  __| `--. \\              |   |\s
                        |   |              /\\__/ /_| |_| |/ /| |___/\\__/ /              |   |\s
                        |   |              \\____/ \\___/|___/ \\____/\\____/               |   |\s
                        |___|                                                           |___|\s
                       (_____)---------------------------------------------------------(_____)\s
                    ==============================================================================
                                               Give Your Sando Some Backup!
                                               
                                                    1- Coleslaw
                                                    2- Pasta Salad
                                                    0- Back
                                               
                                               Choose Your Sides:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "COLESLAW" -> {
                    addSides("Coleslaw");
                    run = false;
                }
                case "2", "PASTA SALAD" -> {
                    addSides("Pasta Salad");
                    run = false;
                }
                case "0", "BACK" -> run = false;
                default -> util.printCentered("Invalid option. Please try again.", 80);
            }
        }
    }

    private void addSides(String sideName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new NonPremiumTopping(sideName, size, true, price));
        util.printCentered(sideName + " Added To Your Order!\n", 80);
    }
    private double getPriceBySize(String size) {
        return 0.0;
    }
}