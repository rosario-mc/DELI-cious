package customerOrder;

import menuItems.Chip;
import menuItems.Drink;
import menuItems.Sandwich;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private String orderID;
    private String orderDate = LocalDateTime.now().toString();
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chip> chips = new ArrayList<>();
    private double totalPrice;

    public Order(String name, String orderID, String orderDate, List<Sandwich> sandwiches, List<Drink> drinks, List<Chip> chips, double totalPrice) {
        this.name = name;
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.totalPrice = totalPrice;
    }

    public Order() {
        this.name = name;
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Sandwich s : sandwiches) total += s.getPrice();
        for (Drink d : drinks) total += d.getPrice();
        for (Chip c : chips) total += c.getPrice();
        this.totalPrice = total;
        return total;
    }
}