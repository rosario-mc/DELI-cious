package menuScreens.customization;

import sandwichComponents.Sandwich;

import java.util.Scanner;

public class SandwichCustomization {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;

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
                case "2", "SANDO SIZE", "SIZE" ->  new Size(sandwich).display();
                case "3", "TOPPINGS" -> new Topping(sandwich).display();
                case "4", "TOAST MY SANDO", "TOAST" -> new Toast(sandwich).display();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid Option. Please Try Again.");
            }
        }
        return sandwich;
    }
}