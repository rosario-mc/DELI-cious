package sandwichComponents;

public class Chip implements CustomizableItem{
    private String name;
    private double price;

    public Chip(String name, double price) {
        this.name = name;
        this.price = price;
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
