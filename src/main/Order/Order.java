package Order;

import Food.FoodItem;

public interface Order {
    void addFoodItem(FoodItem foodItem);
    double getTotalOrderCost();
}
