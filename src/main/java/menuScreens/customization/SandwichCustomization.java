package menuScreens.customization;

import menuScreens.DisplayScreens;
import sandwichComponents.Sandwich;

import java.util.Scanner;

public class SandwichCustomization implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich sandwich = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                     _____                                                                   _____\s
                    ( ___ )-----------------------------------------------------------------( ___ )
                     |   |                                                                   |   |\s
                     |   | ______ _   _ _____ _    ______    _____  ___   _   _______ _____  |   |\s
                     |   | | ___ \\ | | |_   _| |   |  _  \\  /  ___|/ _ \\ | \\ | |  _  \\  _  | |   |\s
                     |   | | |_/ / | | | | | | |   | | | |  \\ `--./ /_\\ \\|  \\| | | | | | | | |   |\s
                     |   | | ___ \\ | | | | | | |   | | | |   `--. \\  _  || . ` | | | | | | | |   |\s
                     |   | | |_/ / |_| |_| |_| |___| |/ /   /\\__/ / | | || |\\  | |/ /\\ \\_/ / |   |\s
                     |   | \\____/ \\___/ \\___/\\_____/___/    \\____/\\_| |_/\\_| \\_/___/  \\___/  |   |\s
                     |___|                                                                   |___|\s
                    (_____)-----------------------------------------------------------------(_____)\s
                    ==============================================================================
                          Please select an option from the following to build your Sando:
                    
                                                 1- Bread Type
                    
                                                 2- Sando Size
                    
                                                 3- Toppings
                    
                                                 4- Toast My Sando
                    
                                                 0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "BREAD TYPE", "BREAD" -> new Bread(sandwich).display();
                case "2", "SANDO SIZE", "SIZE" ->  new Size(sandwich).display();
                case "3", "TOPPINGS" -> new Topping(sandwich).display();
                case "4", "TOAST MY SANDO", "TOAST" -> new Toast(sandwich).display();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}