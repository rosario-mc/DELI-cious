package menuScreens;

import menuScreens.customization.SandwichCustomization;

import java.util.Scanner;

public class TypeOfSandwich implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    SandwichCustomization sando = new SandwichCustomization();

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                                     _____                                  _____\s
                                    ( ___ )--------------------------------( ___ )
                                     |   |                                  |   |\s
                                     |   |  _____  ___   _   _______ _____  |   |\s
                                     |   | /  ___|/ _ \\ | \\ | |  _  \\  _  | |   |\s
                                     |   | \\ `--./ /_\\ \\|  \\| | | | | | | | |   |\s
                                     |   |  `--. \\  _  || . ` | | | | | | | |   |\s
                                     |   | /\\__/ / | | || |\\  | |/ /\\ \\_/ / |   |\s
                                     |   | \\____/\\_| |_/\\_| \\_/___/  \\___/  |   |\s
                                     |___|                                  |___|\s
                                    (_____)--------------------------------(_____)\s
                    ==============================================================================
                                      Please select an option from the following:
                    
                                                 1- Signature Sandos
                    
                                                 2- Build My Own Sando
                    
                                                 0- Back
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                //case "1", "SIGNATURE SANDOS" -> bread.display();
                case "2", "BUILD MY OWN SANDO" -> sando.display();
                case "0", "BACK" -> run = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}