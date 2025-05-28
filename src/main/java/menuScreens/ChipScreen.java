package menuScreens;

import customerOrder.Order;
import sandwichComponents.Chip;

import java.util.Scanner;
import java.util.List;

public class ChipScreen implements DisplayScreens {
    static Scanner input = new Scanner(System.in);
    private Order order;

    public ChipScreen(Order order) {
        this.order = order;
    }

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                    ==============================================================================
                        _____                                                              _____\s
                       ( ___ )------------------------------------------------------------( ___ )
                        |   |                                                              |   |\s
                        |   |               _____  _   _ ___________  _____                |   |\s
                        |   |              /  __ \\| | | |_   _| ___ \\/  ___|               |   |\s
                        |   |              | /  \\/| |_| | | | | |_/ /\\ `--.                |   |\s
                        |   |              | |    |  _  | | | |  __/  `--. \\               |   |\s
                        |   |              | \\__/\\| | | |_| |_| |    /\\__/ /               |   |\s
                        |   |               \\____/\\_| |_/\\___/\\_|    \\____/                |   |\s
                        |___|                                                              |___|\s
                       (_____)------------------------------------------------------------(_____)
                    ==============================================================================
                                            Add Some Crunch To Your Order!
                                   
                                                  1- Hot Cheetos
                                                  2- Lays
                                                  3- Fritos
                                                  4- Doritos
                                                  0- Back
                                      
                                            Choose your crunchy champion:\s""";

            System.out.print(menu);
            String choice = input.nextLine().trim().toUpperCase();

            switch (choice) {
                case "1", "HOT CHEETOS" -> {
                    order.addChip(new Chip("Hot Cheetos"));
                    run = false;
                }
                case "2", "LAYS" -> {
                    order.addChip(new Chip("Lays"));
                    run = false;
                }
                case "3", "FRITOS" -> {
                    order.addChip(new Chip("Fritos"));
                    run = false;
                }
                case "4", "DORITOS" -> {
                    order.addChip(new Chip("Doritos"));
                    run = false;
                }
                case "0", "BACK" -> run = false;
                default -> System.out.println("\nInvalid Option. Please Try Again.\n");
            }
        }
    }
}