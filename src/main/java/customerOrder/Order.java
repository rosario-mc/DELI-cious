package customerOrder;

import sandwichComponents.Chip;
import sandwichComponents.Drink;
import sandwichComponents.Sandwich;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderName;
    private String orderID;
    private String orderDate = LocalDateTime.now().toString();
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chip> chips;
    private double totalPrice;

    public Order(String orderName, String orderID, String orderDate, List<Sandwich> sandwiches, List<Drink> drinks, List<Chip> chips) {
        this.orderName = orderName;
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.sandwiches = sandwiches = new ArrayList<>();
        this.drinks = drinks = new ArrayList<>();
        this.chips = chips = new ArrayList<>();
    }

    public Order() {
        this.orderName = "";
        this.orderID = "";
        this.orderDate = LocalDateTime.now().toString();
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chip> getChips() {
        return chips;
    }

    public void setChips(List<Chip> chips) {
        this.chips = chips;
    }

    public double getTotalPrice() {
        return calculateTotalPrice();
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChip(Chip chip) {
        chips.add(chip);
    }


    public double calculateTotalPrice() {
        double total = 0.0;
        for (Sandwich s : sandwiches) total += s.getPrice();
        for (Drink d : drinks) total += d.getPrice();
        for (Chip c : chips) total += c.getPrice();
        this.totalPrice = total;
        return total;
    }
}