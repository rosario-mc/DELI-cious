package sandwichComponents;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements CustomizableItem {
    private String breadType;
    private String sandoSize;
    private boolean toasted;
    private List<Topping> toppings = new ArrayList<>();
    private double price;

    public Sandwich(String breadType, String sandoSize, boolean toasted, List<Topping> toppings, double price) {
        this.breadType = breadType;
        this.sandoSize = sandoSize;
        this.toasted = toasted;
        this.toppings = toppings;
        this.price = price;
    }

    public Sandwich() {
        this.breadType = breadType;
        this.sandoSize = sandoSize;
        this.toasted = toasted;
        this.toppings = toppings;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void customize() {

    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
