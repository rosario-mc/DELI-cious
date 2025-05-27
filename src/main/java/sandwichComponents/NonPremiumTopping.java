package sandwichComponents;

public class NonPremiumTopping extends Topping{
    public NonPremiumTopping(String name, String sandoSize, boolean premium, double price) {
        super(name, sandoSize, premium, price);
    }
    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }
}
