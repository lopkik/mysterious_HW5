package Toppings;

import Food.FoodItem;

public class FoodItemWithKetchup implements FoodItem {
    private final FoodItem decoratedFoodItem;
    public FoodItemWithKetchup(FoodItem foodItem) {
        this.decoratedFoodItem = foodItem;
    }

    @Override
    public double getCost() {
        return this.decoratedFoodItem.getCost() + 0.50;
    }
}
