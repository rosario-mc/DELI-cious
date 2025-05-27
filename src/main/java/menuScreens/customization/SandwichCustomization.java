package menuScreens.customization;

import sandwichComponents.Sandwich;

import java.util.Scanner;

public class SandwichCustomization{
    static Scanner input = new Scanner(System.in);
    Sandwich sandwich = new Sandwich();


    public Sandwich display() {
        boolean run = true;
        while (run) {
            String menu = """
                    \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
                         _____                                  _____\s
                        ( ___ )--------------------------------( ___ )
                         |   |                                  |   |\s
                         |   | ______ _   _ _____ _    ______   |   |\s
                         |   | | ___ \\ | | |_   _| |   |  _  \\  |   |\s
                         |   | | |_/ / | | | | | | |   | | | |  |   |\s
                         |   | | ___ \\ | | | | | | |   | | | |  |   |\s
                         |   | | |_/ / |_| |_| |_| |___| |/ /   |   |\s
                         |   | \\____/ \\___/ \\___/\\_____/___/    |   |\s
                         |   |                                  |   |\s
                         |   |                                  |   |\s
                         |   |  _____  ___   _   _______ _____  |   |\s
                         |   | /  ___|/ _ \\ | \\ | |  _  \\  _  | |   |\s
                         |   | \\ `--./ /_\\ \\|  \\| | | | | | | | |   |\s
                         |   |  `--. \\  _  || . ` | | | | | | | |   |\s
                         |   | /\\__/ / | | || |\\  | |/ /\\ \\_/ / |   |\s
                         |   | \\____/\\_| |_/\\_| \\_/___/  \\___/  |   |\s
                         |___|                                  |___|\s
                        (_____)--------------------------------(_____)\s
                    =====================================================
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