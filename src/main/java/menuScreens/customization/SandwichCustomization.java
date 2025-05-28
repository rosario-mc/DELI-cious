package menuScreens.customization;

import sandwichComponents.PremiumTopping;
import sandwichComponents.Sandwich;

import java.util.Scanner;

public class SandwichCustomization {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;
    Utils util;

    public SandwichCustomization() {
        this.sandwich = null;
    }

    public SandwichCustomization(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public Sandwich display() {
        if (sandwich == null) {
            sandwich = new Sandwich();
        }
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                          _____                                                       _____\s
                         ( ___ )-----------------------------------------------------( ___ )
                          |   |                                                       |   |\s
                          |   |   ______ _   _ _____ _    ______ _____ _   _ _____    |   |\s
                          |   |   | ___ \\ | | |_   _| |   |  _  \\_   _| \\ | |  __ \\   |   |\s
                          |   |   | |_/ / | | | | | | |   | | | | | | |  \\| | |  \\/   |   |\s
                          |   |   | ___ \\ | | | | | | |   | | | | | | | . ` | | __    |   |\s
                          |   |   | |_/ / |_| |_| |_| |___| |/ / _| |_| |\\  | |_\\ \\   |   |\s
                          |   |   \\____/ \\___/ \\___/\\_____/___/  \\___/\\_| \\_/\\____/   |   |\s
                          |   |                                                       |   |\s
                          |   |                                                       |   |\s
                          |   |       _____ _____ ___ _____ _____ _____ _   _         |   |\s
                          |   |      /  ___|_   _/ _ \\_   _|_   _|  _  | \\ | |        |   |\s
                          |   |      \\ `--.  | |/ /_\\ \\| |   | | | | | |  \\| |        |   |\s
                          |   |       `--. \\ | ||  _  || |   | | | | | | . ` |        |   |\s
                          |   |      /\\__/ / | || | | || |  _| |_\\ \\_/ / |\\  |        |   |\s
                          |   |      \\____/  \\_/\\_| |_/\\_/  \\___/ \\___/\\_| \\_/        |   |\s
                          |___|                                                       |___|\s
                         (_____)-----------------------------------------------------(_____)\s
                    ==============================================================================
                                             Let’s Craft Your Dream Sando!
                    
                                                1- Pick Your Bread
                                                2- Size It Up
                                                3- Top It Off
                                                4- Toast It Up
                                                0- Back to Menu
                    
                                                What’s Next?:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "BREAD TYPE", "BREAD" -> new Bread(sandwich).display();
                case "2", "SANDO SIZE", "SIZE" -> new Size(sandwich).display();
                case "3", "TOPPINGS" -> new Topping(sandwich).display();
                case "4", "TOAST MY SANDO", "TOAST" -> new Toast(sandwich).display();
                case "0", "BACK" -> run = false;
                default -> util.printCentered("Invalid Option. Please Try Again.\n", 80);
            }
        }
        return sandwich;
    }

    public Sandwich customizeExistingSandwich(Sandwich sandwich) {
        boolean customizing = true;
        Scanner input = new Scanner(System.in);

        while (customizing) {
            util.printCentered("\nCurrent Sandwich: " + sandwich.getName(), 80);
            System.out.println("Toppings:");
            for (int i = 0; i < sandwich.getToppings().size(); i++) {
                System.out.println((i + 1) + ". " + sandwich.getToppings().get(i).getName());
            }
            util.printCentered("Sauces: " + sandwich.getSauces(), 80);
            util.printCentered("Bread: " + sandwich.getBreadType(), 80);
            util.printCentered("Size: " + sandwich.getSandoSize(), 80);
            util.printCentered("Toasted: " + (sandwich.isToasted() ? "Yes" : "No"), 80);

            System.out.println("""
                    ==============================================================================
                        _____                                                           _____\s
                       ( ___ )---------------------------------------------------------( ___ )
                        |   |                                                           |   |\s
                        |   |  _____ _   _ _____ _____ ________  ________ ______ _____  |   |\s
                        |   | /  __ \\ | | /  ___|_   _|  _  |  \\/  |_   _|___  /|  ___| |   |\s
                        |   | | /  \\/ | | \\ `--.  | | | | | | .  . | | |    / / | |__   |   |\s
                        |   | | |   | | | |`--. \\ | | | | | | |\\/| | | |   / /  |  __|  |   |\s
                        |   | | \\__/\\ |_| /\\__/ / | | \\ \\_/ / |  | |_| |_./ /___| |___  |   |\s
                        |   |  \\____/\\___/\\____/  \\_/  \\___/\\_|  |_/\\___/\\_____/\\____/  |   |\s
                        |___|                                                           |___|\s
                       (_____)---------------------------------------------------------(_____)\s
                    ==============================================================================
                                               What Would You Like To Do?
                                               
                                                   1 - Add Topping
                                                   2 - Remove Topping
                                                   3 - Add Sauce
                                                   4 - Remove Sauce
                                                   5 - Toggle Toasted
                                                   0 - Finish Customizing
                                                   
                                                   Your Choice:""");

            String choice = input.nextLine();

            switch (choice) {
                case "1" -> {
                    util.printCentered("Enter Topping Name To Add:\s", 80);
                    String toppingName = input.nextLine();

                    sandwich.getToppings().add(new PremiumTopping(toppingName));
                    util.printCentered(toppingName + " Added To Sando.\n", 80);
                }
                case "2" -> {
                    util.printCentered("Enter Topping Number To Remove:\s", 80);
                    int index = Integer.parseInt(input.nextLine()) - 1;
                    if (index >= 0 && index < sandwich.getToppings().size()) {
                        String removed = sandwich.getToppings().remove(index).getName();
                        util.printCentered(removed + " Removed From Sando!\n", 80);
                    } else {
                        util.printCentered("Invalid Topping Number.\n", 80);
                    }
                }
                case "3" -> {
                    util.printCentered("Enter Sauce To Add:\s", 80);
                    String sauce = input.nextLine();
                    sandwich.getSauces().add(sauce);
                    util.printCentered(sauce + " Added To Sando!\n", 80);
                }
                case "4" -> {
                    util.printCentered("Enter Sauce Name To Remove:\s", 80);
                    String sauce = input.nextLine();
                    if (sandwich.getSauces().remove(sauce)) {
                        util.printCentered(sauce + " Removed From Sando!", 80);
                    } else {
                        System.out.println("Sauce not found.");
                    }
                }
                case "5" -> {
                    sandwich.setToasted(!sandwich.isToasted());
                    util.printCentered("Toasted Toggled To: " + (sandwich.isToasted() ? "Yes" : "No"), 80);
                }
                case "0" -> {
                    customizing = false;
                }
                default -> util.printCentered("Invalid Option. Please Try again.\n", 80);
            }
        }

        return sandwich;
    }
}