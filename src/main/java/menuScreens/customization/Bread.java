package menuScreens.customization;

import menuItems.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Bread implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich bread = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                      _____                                 _____\s
                                     ( ___ )-------------------------------( ___ )
                                      |   |                                 |   |\s
                                      |   | ____________ _____  ___ ______  |   |\s
                                      |   | | ___ \\ ___ \\  ___|/ _ \\|  _  \\ |   |\s
                                      |   | | |_/ / |_/ / |__ / /_\\ \\ | | | |   |\s
                                      |   | | ___ \\    /|  __||  _  | | | | |   |\s
                                      |   | | |_/ / |\\ \\| |___| | | | |/ /  |   |\s
                                      |   | \\____/\\_| \\_\\____/\\_| |_/___/   |   |\s
                                      |___|                                 |___|\s
                                     (_____)-------------------------------(_____)\s
                    ==============================================================================
                                     Please select a bread option from the following:
                    
                                                   1- White
                    
                                                   2- Wheat
                    
                                                   3- Rye
                    
                                                   4- Wrap
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "WHITE" -> bread.getBreadType();
                case "2", "WHEAT" -> bread.getBreadType();
                case "3", "RYE" -> bread.getBreadType();
                case "4", "WRAP" -> bread.getBreadType();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
