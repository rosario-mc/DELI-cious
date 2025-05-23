package menuItems;

abstract class Topping {
    String name;
    boolean premium;
    double price;

    public Topping(String name, boolean premium, double price) {
        this.name = name;
        this.premium = premium;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
