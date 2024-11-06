package Toppings;

import Food.FoodItem;

public class FoodItemWithPickles implements FoodItem {
    private final FoodItem decoratedFoodItem;
    public FoodItemWithPickles(FoodItem foodItem) {
        this.decoratedFoodItem = foodItem;
    }

    @Override
    public double getCost() {
        return this.decoratedFoodItem.getCost() + 2;
    }
}
