package sandwichComponents;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements CustomizableItem {
    private String breadType;
    private String sandoSize;
    private boolean toasted;
    private List<Topping> toppings = new ArrayList<>();
    private List<String> sauces;
    private double basePrice;
    private boolean hasExtraMeat;
    private boolean hasExtraCheese;

    public Sandwich(String breadType, String sandoSize, boolean toasted, List<Topping> toppings, List<String> sauces) {
        this.breadType = breadType;
        this.sandoSize = sandoSize;
        this.toasted = toasted;
        this.toppings = toppings != null ? toppings : new ArrayList<>();
        this.sauces = sauces != null ? sauces : new ArrayList<>();
        this.basePrice = 0.0;
    }

    public Sandwich() {
        this.breadType = "";
        this.sandoSize = "";
        this.toasted = false;
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.basePrice = 0.0;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getSandoSize() {
        return sandoSize;
    }

    public void setSandoSize(String sandoSize) {
        this.sandoSize = sandoSize;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
        return calculatePrice();
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setHasExtraMeat(boolean hasExtraMeat) {
        this.hasExtraMeat = hasExtraMeat;
    }

    public void setHasExtraCheese(boolean hasExtraCheese) {
        this.hasExtraCheese = hasExtraCheese;
    }

    private double getPriceBySize(String size) {
        return switch (size) {
            case "4" -> 5.50;
            case "8" -> 7.00;
            case "12" -> 8.50;
            default -> 0.0;
        };
    }

    private double getExtraMeatPriceBySize(String size) {
        return switch (size) {
            case "4" -> 0.50;
            case "8" -> 1.00;
            case "12" -> 1.50;
            default -> 0.0;
        };
    }

    private double getExtraCheesePriceBySize(String size) {
        return switch (size) {
            case "4" -> 0.30;
            case "8" -> 0.60;
            case "12" -> 1.50;
            default -> 0.0;
        };
    }

    private double calculateToppingsPrice() {
        return toppings.stream().mapToDouble(Topping::getPrice).sum();
    }

    @Override
    public double calculatePrice() {
        double total = getPriceBySize(sandoSize);
        total += calculateToppingsPrice();

        if (hasExtraMeat) {
            total += getExtraMeatPriceBySize(sandoSize);
        }

        if (hasExtraCheese) {
            total += getExtraCheesePriceBySize(sandoSize);
        }

        return total;
    }

    @Override
    public void customize() {
        // Your customization logic here if needed
    }

    @Override
    public String toString() {
        StringBuilder toppingsList = new StringBuilder();
        if (toppings.isEmpty()) {
            toppingsList.append("    None");
        } else {
            for (Topping topping : toppings) {
                toppingsList.append("    • ").append(topping.toString()).append("\n");
            }
        }
        if (hasExtraMeat) {
            toppingsList.append("    • Extra Meat ($")
                    .append(String.format("%.2f", getExtraMeatPriceBySize(sandoSize)))
                    .append(")\n");
        }
        if (hasExtraCheese) {
            toppingsList.append("    • Extra Cheese ($")
                    .append(String.format("%.2f", getExtraCheesePriceBySize(sandoSize)))
                    .append(")\n");
        }

        return """
                Sando: Build My Own Sando
                  - Bread: %s
                  - Size: %s
                  - Toppings:
                   %s
                  - Toasted: %s
                  - Price: $%.2f
                """.formatted(
                breadType,
                sandoSize,
                toppingsList.toString().trim(),
                toasted ? "Yes" : "No",
                calculatePrice()
        );
    }
}