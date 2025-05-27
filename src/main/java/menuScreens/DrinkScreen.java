package menuScreens;

import customerOrder.Order;
import sandwichComponents.Drink;

import java.util.List;
import java.util.Scanner;

public class DrinkScreen implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Order order;
    private String selectedDrinkName = "";

    public DrinkScreen(Order order) {
        this.order = order;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                        \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
                          _____                                         _____\s
                         ( ___ )---------------------------------------( ___ )
                          |   |                                         |   |\s
                          |   | ____________ _____ _   _  _   __ _____  |   |\s
                          |   | |  _  \\ ___ \\_   _| \\ | || | / //  ___| |   |\s
                          |   | | | | | |_/ / | | |  \\| || |/ / \\ `--.  |   |\s
                          |   | | | | |    /  | | | . ` ||    \\  `--. \\ |   |\s
                          |   | | |/ /| |\\ \\ _| |_| |\\  || |\\  \\/\\__/ / |   |\s
                          |   | |___/ \\_| \\_|\\___/\\_| \\_/\\_| \\_/\\____/  |   |\s
                          |___|                                         |___|\s
                         (_____)---------------------------------------(_____)
                    ========================================================
                                         Quench Your Thirst!
                                         1- House Made Lemonade
                                         2- Fountain Drink
                                         Pick a Drink!:\s""";

            System.out.print(menu);
            String choice = input.nextLine().trim().toUpperCase();

            switch (choice) {
                case "1", "HOUSE MADE LEMONADE" -> {
                    selectedDrinkName = "House Made Lemonade";
                    DrinkScreenSize();
                    run = false;
                }
                case "2", "FOUNTAIN DRINK" -> {
                    selectedDrinkName = "Fountain Drink";
                    DrinkScreenSize();
                    run = false;
                }
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }

    public void DrinkScreenSize() {
        boolean run = true;
        while (run) {
            String menu = """
                        \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
                          _____                                         _____\s
                         ( ___ )---------------------------------------( ___ )
                          |   |                                         |   |\s
                          |   | ____________ _____ _   _  _   __ _____  |   |\s
                          |   | |  _  \\ ___ \\_   _| \\ | || | / //  ___| |   |\s
                          |   | | | | | |_/ / | | |  \\| || |/ / \\ `--.  |   |\s
                          |   | | | | |    /  | | | . ` ||    \\  `--. \\ |   |\s
                          |   | | |/ /| |\\ \\ _| |_| |\\  || |\\  \\/\\__/ / |   |\s
                          |   | |___/ \\_| \\_|\\___/\\_| \\_/\\_| \\_/\\____/  |   |\s
                          |___|                                         |___|\s
                         (_____)---------------------------------------(_____)
                    ========================================================
                                         How Thirsty Are You?
                                         1- Small
                                         2- Medium
                                         3- Large
                                         Pick a Size:\s""";

            System.out.print(menu);
            String choice = input.nextLine().trim().toUpperCase();

            switch (choice) {
                case "1", "SMALL" -> {
                    order.setDrinks(List.of(new Drink(selectedDrinkName, "SMALL")));
                    run = false;
                }
                case "2", "MEDIUM" -> {
                    order.setDrinks(List.of(new Drink(selectedDrinkName, "MEDIUM")));
                    run = false;
                }
                case "3", "LARGE" -> {
                    order.setDrinks(List.of(new Drink(selectedDrinkName, "LARGE")));
                    run = false;
                }
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }
}