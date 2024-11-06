package Toppings;

import Food.FoodItem;
import Food.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodItemWithOnionsTest {

    @Test
    void getCost() {
        FoodItem hotdog = new FoodItemWithOnions(new HotDog());

        assertEquals(3.00, hotdog.getCost());
    }
}