package menuScreens.customization;

import menuItems.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Size implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich size = new Sandwich();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                         _____                            _____\s
                                        ( ___ )--------------------------( ___ )
                                         |   |                            |   |\s
                                         |   |  _____ _____ ______ _____  |   |\s
                                         |   | /  ___|_   _|___  /|  ___| |   |\s
                                         |   | \\ `--.  | |    / / | |__   |   |\s
                                         |   |  `--. \\ | |   / /  |  __|  |   |\s
                                         |   | /\\__/ /_| |_./ /___| |___  |   |\s
                                         |   | \\____/ \\___/\\_____/\\____/  |   |\s
                                         |___|                            |___|\s
                                        (_____)--------------------------(_____)\s
                    ==============================================================================
                                     Please select a size option from the following:
                    
                                                   1- 4"
                    
                                                   2- 8"
                    
                                                   3- 12"
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "4" -> size.getSandoSize();
                case "2", "8" -> size.getSandoSize();
                case "3", "12" -> size.getSandoSize();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
