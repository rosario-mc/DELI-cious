package sandwichComponents;

import java.util.List;

abstract class SignatureSando extends Sandwich{
    private String name;
    private String description;
    private boolean customizable;
    private double fixedPrice;

    public SignatureSando(String breadType, String sandoSize, boolean toasted, List<Topping> toppings, double price, String name, String description, boolean customizable, double fixedPrice) {
        super(breadType, sandoSize, toasted, toppings, price);
        this.name = name;
        this.description = description;
        this.customizable = customizable;
        this.fixedPrice = fixedPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCustomizable() {
        return customizable;
    }

    public void setCustomizable(boolean customizable) {
        this.customizable = customizable;
    }

    public double getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
}
