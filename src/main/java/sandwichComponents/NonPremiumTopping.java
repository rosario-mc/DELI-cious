package sandwichComponents;

public class NonPremiumTopping extends Topping{

    private String type;

    public NonPremiumTopping(String name, String sandoSize, boolean premium, double price) {
        super(name, sandoSize, premium, price);
    }
    public NonPremiumTopping(String name, String sandoSize) {
        super(name, sandoSize, false, 0.00);
    }

    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }
}