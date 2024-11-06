package Driver;

import Food.Burger;
import Food.FoodItem;
import Food.Fries;
import Food.HotDog;
import LoyaltyStatus.CustomerLoyaltyStatus;
import Order.BasicOrder;
import Toppings.FoodItemWithKetchup;
import Toppings.FoodItemWithOnions;
import Toppings.FoodItemWithPickles;

public class RestaurantDriver {
    public static void main(String[] args) {
        FoodItem burger1 = new FoodItemWithKetchup(new FoodItemWithPickles(new FoodItemWithOnions(new Burger())));
        FoodItem burger2 = new Burger();
        FoodItem hotdog1 = new FoodItemWithKetchup(new HotDog());
        FoodItem hotdog2 = new FoodItemWithOnions(new HotDog());
        FoodItem hotdog3 = new FoodItemWithPickles(new HotDog());
        FoodItem fries1 = new Fries();
        FoodItem fries2 = new Fries();
        FoodItem fries3 = new FoodItemWithKetchup(new FoodItemWithOnions(new Fries()));

        BasicOrder basicOrder = new BasicOrder();
        basicOrder.addFoodItem(burger1);
        basicOrder.addFoodItem(burger2);
        basicOrder.addFoodItem(hotdog1);
        basicOrder.addFoodItem(hotdog2);
        basicOrder.addFoodItem(hotdog3);
        basicOrder.addFoodItem(fries1);
        basicOrder.addFoodItem(fries2);
        basicOrder.addFoodItem(fries3);

        double basicOrderCost = basicOrder.getTotalOrderCost();
        System.out.println("Basic order total cost: " + basicOrderCost);

        CustomerLoyaltyStatus bronze = new CustomerLoyaltyStatus(CustomerLoyaltyStatus.LoyaltyStatus.BRONZE);
        System.out.println("Bronze loyalty order cost: " + bronze.getDiscountCost(basicOrderCost));

        CustomerLoyaltyStatus silver = new CustomerLoyaltyStatus(CustomerLoyaltyStatus.LoyaltyStatus.SILVER);
        System.out.println("Silver loyalty order cost: " + silver.getDiscountCost(basicOrderCost));

        CustomerLoyaltyStatus gold = new CustomerLoyaltyStatus(CustomerLoyaltyStatus.LoyaltyStatus.GOLD);
        System.out.println("Gold loyalty order cost: " + gold.getDiscountCost(basicOrderCost));
    }
}