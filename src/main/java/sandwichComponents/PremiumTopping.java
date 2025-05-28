package sandwichComponents;

public class PremiumTopping extends Topping{
    private String type;

    public PremiumTopping(String name, String sandoSize, boolean premium, double price, String type) {
        super(name, sandoSize, premium, price);
        this.type = type;
    }

    public PremiumTopping(String name, String sandoSize, boolean premium, double price) {
        super(name, sandoSize, premium, price);
    }

    public PremiumTopping(String name) {
        super(name, "", true, 0.0);
    }


    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }
}
