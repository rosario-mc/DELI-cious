package menuScreens.customization;

import sandwichComponents.NonPremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Veggies implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

    public Veggies(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                _____                                             _____\s
                               ( ___ )-------------------------------------------( ___ )
                                |   |                                             |   |\s
                                |   |  _   _ _____ _____ _____ _____ _____ _____  |   |\s
                                |   | | | | |  ___|  __ \\  __ \\_   _|  ___/  ___| |   |\s
                                |   | | | | | |__ | |  \\/ |  \\/ | | | |__ \\ `--.  |   |\s
                                |   | | | | |  __|| | __| | __  | | |  __| `--. \\ |   |\s
                                |   | \\ \\_/ / |___| |_\\ \\ |_\\ \\_| |_| |___/\\__/ / |   |\s
                                |   |  \\___/\\____/ \\____/\\____/\\___/\\____/\\____/  |   |\s
                                |___|                                             |___|\s
                               (_____)-------------------------------------------(_____)\s
                    ==============================================================================
                                             Pick your fresh and crispy crew:
                                                   1- Lettuce
                                                   2- Peppers
                                                   3- Onions
                                                   4- Tomatoes
                                                   5- Jalapeños
                                                   6- Cucumbers
                                                   7- Pickles
                                                   8- Guacamole
                                                   9- Mushrooms
                                                   10- Add Extra Veggies
                                                   0- Back
                                                Your Green Selection:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "LETTUCE" -> addVeggies("Lettuce");
                case "2", "PEPPERS" -> addVeggies("Peppers");
                case "3", "ONIONS" -> addVeggies("Onions");
                case "4", "TOMATOES" -> addVeggies("Tomatoes");
                case "5", "JALAPEÑOS" -> addVeggies("Jalapeños");
                case "6", "CUCUMBERS" -> addVeggies("Cucumbers");
                case "7", "PICKLES" -> addVeggies("Pickles");
                case "8", "GUACAMOLE" -> addVeggies("Guacamole");
                case "9", "MUSHROOMS" -> addVeggies("Mushrooms");
                case "10", "ADD EXTRA", "EXTRA" -> addVeggies("Extra Veggies");
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addVeggies(String vegName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new NonPremiumTopping(vegName, size, false, price));
        System.out.println(vegName + " Added To Your Sando (" + size + "\", $" + price + ").");
    }

    private double getPriceBySize(String size) {
        return 0.0;
    }
}