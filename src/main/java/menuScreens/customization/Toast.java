package menuScreens.customization;

import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Toast implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Toast(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                               _____                                              _____\s
                              ( ___ )--------------------------------------------( ___ )
                               |   |                                              |   |\s
                               |   |  _____ _____  ___   _____ _____ ___________  |   |\s
                               |   | |_   _|  _  |/ _ \\ /  ___|_   _|  ___|  _  \\ |   |\s
                               |   |   | | | | | / /_\\ \\\\ `--.  | | | |__ | | | | |   |\s
                               |   |   | | | | | |  _  | `--. \\ | | |  __|| | | | |   |\s
                               |   |   | | \\ \\_/ / | | |/\\__/ / | | | |___| |/ /  |   |\s
                               |   |   \\_/  \\___/\\_| |_/\\____/  \\_/ \\____/|___/   |   |\s
                               |___|                                              |___|\s
                              (_____)--------------------------------------------(_____)\s
                    ==============================================================================
                                         Warm, melty magic or soft and fresh?
                                                   1- Yes
                                                   2- No
                                                   0- Back
                                                   Toasted:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "YES" -> sandwich.setToasted(true);
                case "2", "NO" -> sandwich.setToasted(false);
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
    private void addToast(boolean toast) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        System.out.println(toast + " Added To Your Sando (" + size + "\", $" + price + ").");
    }

    private double getPriceBySize(String size) {
        return 0.0;
        }
    }