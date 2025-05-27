package sandwichComponents;

public class Chip implements CustomizableItem{
    private String name;
    private double price;

    public Chip(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Chip(String name) {
        this.name = name;
        this.price = getPriceByName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    private double getPriceByName(String name) {
        return switch (name.toUpperCase()) {
            case "HOT CHEETOS", "DORITOS", "LAYS", "FRITOS" -> 1.50;
            default -> 0.00;
        };
    }


    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", price) + ")";
    }

    @Override
    public void customize() {

    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
