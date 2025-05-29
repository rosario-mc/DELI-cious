package sandwichComponents;

import java.util.ArrayList;
import java.util.List;

public class SignatureSando extends Sandwich{
    private String description;
    private boolean customizable;
    private double fixedPrice;
    private List<Topping> defaultToppings;

    public SignatureSando(String breadType, String sandoSize, boolean toasted, List<Topping> toppings, List<String> sauces, String name, String description, boolean customizable, double fixedPrice) {
        super(name, breadType, sandoSize, toasted, toppings, sauces);
        this.description = description;
        this.customizable = customizable;
        this.fixedPrice = fixedPrice;
        this.defaultToppings = new ArrayList<>(getToppings());
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

    @Override
    public double calculatePrice() {
        double total = fixedPrice;

        for (Topping topping : getToppings()) {
            if (!defaultToppings.contains(topping)) {
                total += topping.getPrice();
            }
        }

        if (hasExtraCheese()) {
            total += getExtraCheesePriceBySize(getSandoSize());
        }

        if (hasExtraMeat()) {
            total += getExtraMeatPriceBySize(getSandoSize());
        }

        return total;
    }
}