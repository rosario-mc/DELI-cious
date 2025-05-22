package menuScreens;

import java.util.Scanner;

public class OrderScreen implements DisplayScreens {
    static Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        boolean run = true;
        while (run) {
            String menu = """
                         _______         __                \s
                        |   _   .----.--|  .-----.----.    \s
                        |.  |   |   _|  _  |  -__|   _|    \s
                        |.  |   |__| |_____|_____|__|      \s
                        |:  1   |                          \s
                        |::.. . |                          \s
                        `-------'                 \s
                    =============================================
                    Please select an option from the following:
                    
                    1- Add Sandwich
                    
                    2- Add Drink
                    
                    3- Add Chips
                    
                    4- Checkout
                    
                    0- Cancel Order
                    """;
            System.out.println(menu);
            String choice = input.nextLine().toUpperCase();
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "1", "NEW ORDER", "ORDER", "NEW" -> order.display();
                case "2", "EXIT", "DONE", "BYE", "GOODBYE" -> {
        }
    }
}