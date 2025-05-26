package sandwichComponents;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements CustomizableItem {
    private String breadType;
    private String sandoSize;
    private boolean toasted;
    private List<Topping> toppings = new ArrayList<>();
    private List<String> sauces;
    private double basePrice;  // <-- Add this

    // Constructors
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

    // Getters & Setters
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

    // Fix: The setter should accept a List<Topping>, not return it
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

    // New base price getter and setter
    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
        return calculatePrice();
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // Implementing calculatePrice() to sum base price + toppings price
    @Override
    public double calculatePrice() {
        double toppingsTotal = 0.0;
        for (Topping topping : toppings) {
            toppingsTotal += topping.getPrice(); // Assuming Topping has getPrice()
        }
        return basePrice + toppingsTotal;
    }

    @Override
    public void customize() {
        // Your customization logic here if needed
    }
}