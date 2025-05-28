package menuScreens.customization;

import sandwichComponents.Sandwich;
import menuScreens.DisplayScreens;

import java.util.Scanner;

public class Toast implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Sandwich sandwich;
    Utils util;

    public Toast(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                            _____                                                     _____\s
                           ( ___ )---------------------------------------------------( ___ )
                            |   |                                                     |   |\s
                            |   |     _____ _____  ___   _____ _____ ___________      |   |\s
                            |   |    |_   _|  _  |/ _ \\ /  ___|_   _|  ___|  _  \\     |   |\s
                            |   |      | | | | | / /_\\ \\\\ `--.  | | | |__ | | | |     |   |\s
                            |   |      | | | | | |  _  | `--. \\ | | |  __|| | | |     |   |\s
                            |   |      | | \\ \\_/ / | | |/\\__/ / | | | |___| |/ /      |   |\s
                            |   |      \\_/  \\___/\\_| |_/\\____/  \\_/ \\____/|___/       |   |\s
                            |___|                                                     |___|\s
                           (_____)---------------------------------------------------(_____)\s
                    ==============================================================================
                                           Warm, Melty Magic Or Soft & Fresh?
                                           
                                                    1- Yes
                                                    2- No
                                                   
                                                 Toasted:\s""";
            System.out.print(menu);
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "YES" -> {
                    sandwich.setToasted(true);
                    util.printCentered("Toasting Your Deli-cious Sando!\n", 80);
                    run = false;
                }
                case "2", "NO" ->{
                    sandwich.setToasted(false);
                    util.printCentered("Wrapping Your Sando Up!\n", 80);
                    run = false;
                }
                default -> util.printCentered("Invalid Option. Please Try Again.", 80);
            }
        }
    }
}