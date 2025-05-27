package sandwichComponents;

public class PremiumTopping extends Topping{
    public PremiumTopping(String name, String sandoSize, boolean premium, double price) {
        super(name, sandoSize, premium, price);
    }
    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }
}
