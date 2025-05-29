package sandwichComponents;

public class PremiumTopping extends Topping {
    private String type;

    public PremiumTopping(String name, String sandoSize) {
        super(name, sandoSize, true, determinePrice(name, sandoSize));
        this.type = determineType(name);
    }

    private static String determineType(String name) {
        return switch (name.toLowerCase()) {
            case "steak", "ham", "salami", "roast beef", "chicken", "bacon" -> "meat";
            case "american", "provolone", "cheddar", "swiss" -> "cheese";
            default -> "unknown";
        };
    }

    private static double determinePrice(String name, String size) {
        String type = determineType(name);

        return switch (type) {
            case "meat" -> switch (size) {
                case "4" -> 1.00;
                case "8" -> 2.00;
                case "12" -> 3.00;
                default -> 0.0;
            };
            case "cheese" -> switch (size) {
                case "4" -> 0.75;
                case "8" -> 1.50;
                case "12" -> 2.25;
                default -> 0.0;
            };
            default -> 0.0;
        };
    }

    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }
}