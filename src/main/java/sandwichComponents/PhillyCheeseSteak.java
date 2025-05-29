package sandwichComponents;

import java.util.ArrayList;
import java.util.List;

public class PhillyCheeseSteak extends SignatureSando {
    public PhillyCheeseSteak() {
        super(
                "White",
                "8",
                false,
                createToppings(),
                createSauces(),
                "Philly Cheese Steak",
                "Steak & Cheese With Peppers On Toasted Bread",
                true,
                10.50
        );
    }

    private static List<Topping> createToppings() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new PremiumTopping("Steak", "8"));
        toppings.add(new PremiumTopping("American", "8"));
        toppings.add(new NonPremiumTopping("Peppers", "8"));
        return toppings;
    }

    private static List<String> createSauces() {
        List<String> sauces = new ArrayList<>();
        sauces.add("Mayo");
        return sauces;
    }
}