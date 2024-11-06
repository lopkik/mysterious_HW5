package Order;

import Food.FoodItem;

import java.util.ArrayList;

public class BasicOrder {
    private final ArrayList<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem (FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double getTotalOrderCost () {
        double totalCost = 0;
        for (FoodItem foodItem : foodItems)
            totalCost += foodItem.getCost();
        return totalCost;
    }
}
