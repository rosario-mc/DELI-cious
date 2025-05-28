package menuScreens.customization;

import sandwichComponents.NonPremiumTopping;
import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Veggies implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;
    Utils util;

    public Veggies(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean selecting = true;
        while (selecting) {
            System.out.println("""
                         \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
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
                    =================================================================
                                      Pick Your Fresh & Crispy Crew:
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
                                            0- Done Choosing Veggies
                               (Separate By Comma, If Choosing Multiple)""");
            util.printCentered("Your Green Selections:\s", 60);
            String inputLine = input.nextLine();
            String[] choices = inputLine.split("\\s*,\\s*");

            for (String choice : choices) {
                choice = choice.toUpperCase().trim();

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
                    case "0", "DONE" -> selecting = false;
                    default -> System.out.println("Invalid Option. Please Try Again.");
                }
                if (!selecting) break;
            }
        }
    }

    private void addVeggies(String vegName) {
        String size = sandwich.getSandoSize();
        double price = getPriceBySize(size);
        sandwich.addTopping(new NonPremiumTopping(vegName, size, false, price));
        System.out.println(vegName + " Added To Your Sando!");
    }

    private double getPriceBySize(String size) {
        return 0.0;
    }
}