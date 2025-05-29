package sandwichComponents;

public class Drink implements CustomizableItem {
    private String name;
    private String size;
    private double price;

    public Drink(String name, String size) {
        this.name = name;
        setSize(size); // will set price too
    }

    public Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        this.price = getPriceBySize(size);
    }

    public double getPrice() {
        return price;
    }


    private double getPriceBySize(String size) {
        return switch (size) {
            case "SMALL" -> 2.00;
            case "MEDIUM" -> 2.50;
            case "LARGE" -> 3.00;
            default -> 0.0;
        };
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public double calculatePrice() {
        return getPriceBySize(size);
    }

    @Override
    public String toString() {
        return name;
    }
}