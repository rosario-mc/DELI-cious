package sandwichComponents;

public abstract class Topping {
    String name;
    String sandoSize;
    boolean premium;
    double price;

    public Topping(String name, String sandoSize, boolean premium, double price) {
        this.name = name;
        this.sandoSize = sandoSize;
        this.premium = premium;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSandoSize() {
        return sandoSize;
    }

    public void setSandoSize(String sandoSize) {
        this.sandoSize = sandoSize;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}