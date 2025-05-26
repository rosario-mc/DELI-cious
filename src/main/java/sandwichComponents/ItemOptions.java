package sandwichComponents;

import java.util.ArrayList;
import java.util.List;

public class ItemOptions {

    List<Topping> premiumMeat4;
    List<Topping> premiumMeat8;
    List<Topping> premiumMeat12;
    List<Topping> premiumCheese4;
    List<Topping> premiumCheese8;
    List<Topping> premiumCheese12;
    List<Topping> nonPremVeg;
    List<Topping> nonPremSauce;
    List<Topping> nonPremSides;

    public ItemOptions() {
        List<String> meatNames = List.of("Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon");
        premiumMeat4 = createPremiumTopping(meatNames, "4", true, 1.00);
        premiumMeat8 = createPremiumTopping(meatNames, "8", true, 2.00);
        premiumMeat12 = createPremiumTopping(meatNames, "12", true, 3.00);

        List<String> cheeseNames = List.of("American", "Provolone", "Cheddar", "Swiss");
        premiumCheese4 = createPremiumTopping(cheeseNames, "4", true, 0.75);
        premiumCheese8 = createPremiumTopping(cheeseNames, "8", true, 1.50);
        premiumCheese12 = createPremiumTopping(cheeseNames, "12", true, 2.25);

        List<String> vegNames = List.of("Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapeños", "Cucumbers", "Pickles", "Guacalome", "Mushrooms");
        nonPremVeg = createNonPremiumTopping(vegNames, "4", false, 0.00);
        nonPremVeg = createNonPremiumTopping(vegNames, "8", false, 0.00);
        nonPremVeg = createNonPremiumTopping(vegNames, "12", false, 0.00);

        List<String> sauce = List.of("Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Islands", "Vinaigrette");
        nonPremSauce = createNonPremiumTopping(sauce, "4", false, 0.00);
        nonPremSauce = createNonPremiumTopping(sauce, "8", false, 0.00);
        nonPremSauce = createNonPremiumTopping(sauce, "12", false, 0.00);

        List<String> sides = List.of("Au Jus", "Sauce");
        nonPremSides = createNonPremiumTopping(sides, "4", false, 0.00);
        nonPremSides = createNonPremiumTopping(sides, "8", false, 0.00);
        nonPremSides = createNonPremiumTopping(sides, "12", false, 0.00);
    }

    public List<Topping> createPremiumTopping(List<String> names, String size, boolean isPremium, double price) {
        List<Topping> premTop = new ArrayList<>();
        for (String name : names) {
            premTop.add(new PremiumTopping(name, size, isPremium, price));
        }
        return premTop;
    }

    public List<Topping> createNonPremiumTopping(List<String> names, String size, boolean isPremium, double price) {
        List<Topping> nonPremTop = new ArrayList<>();
        for (String name : names) {
            nonPremTop.add(new NonPremiuimTopping(name, size, isPremium, price));
        }
        return nonPremTop;
    }
}