package Toppings;

import Food.FoodItem;

public class FoodItemWithOnions implements FoodItem {
    private final FoodItem decoratedFoodItem;
    public FoodItemWithOnions(FoodItem foodItem) {
        this.decoratedFoodItem = foodItem;
    }

    @Override
    public double getCost() {
        return this.decoratedFoodItem.getCost() + 1.50;
    }
}
