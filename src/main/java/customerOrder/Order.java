package customerOrder;

import menuItems.Chip;
import menuItems.Drink;
import menuItems.Sandwich;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private String orderDate = LocalDate.now().toString();
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chip> chips = new ArrayList<>();

    public Order(String name, String orderDate, List<Sandwich> sandwiches, List<Drink> drinks, List<Chip> chips) {
        this.name = name;
        this.orderDate = orderDate;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}