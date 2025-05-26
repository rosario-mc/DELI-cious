package menuScreens.customization;

import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Toast implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    Sandwich toast = new Sandwich();

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
                                     Please select a size option from the following:
                    
                                                   1- Yes
                    
                                                   2- No
                    
                                                   0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "YES" -> toast.isToasted();
                case "2", "NO" -> toast.isToasted();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
