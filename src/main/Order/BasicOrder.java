package Order;

import Food.FoodItem;

import java.util.ArrayList;

public class BasicOrder implements Order {
    private final ArrayList<FoodItem> foodItems = new ArrayList<>();

    @Override
    public void addFoodItem (FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    @Override
    public double getTotalOrderCost () {
        double totalCost = 0;
        for (FoodItem foodItem : foodItems)
            totalCost += foodItem.getCost();
        return totalCost;
    }
}
