package sandwichComponents;

import java.util.ArrayList;
import java.util.List;

public class BLT extends SignatureSando {

    public BLT() {
        super(
                "White",
                "8",
                false,
                createToppings(),
                createSauces(),
                "BLT",
                "Bacon, Lettuce, & Tomato On White Bread With Mayo",
                false,
                9.00
        );
    }

    private static List<Topping> createToppings() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new PremiumTopping("Bacon", "8"));
        toppings.add(new NonPremiumTopping("Lettuce", "8"));
        toppings.add(new NonPremiumTopping("Tomato", "8"));
        return toppings;
    }

    private static List<String> createSauces() {
        List<String> sauces = new ArrayList<>();
        sauces.add("Mayo");
        return sauces;
    }
}