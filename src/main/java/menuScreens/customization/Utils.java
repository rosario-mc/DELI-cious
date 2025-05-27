package menuScreens.customization;

public class Utils {
    public static void printCentered(String text, int width) {
        int padding = (width - text.length()) / 2;
        String spaces = " ".repeat(Math.max(0, padding));
        System.out.print(spaces + text);
    }
}
