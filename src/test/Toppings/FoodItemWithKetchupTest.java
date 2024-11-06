package Toppings;

import Food.FoodItem;
import Food.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodItemWithKetchupTest {

    @Test
    void getCost() {
        FoodItem hotdog = new FoodItemWithKetchup(new HotDog());

        assertEquals(2.00, hotdog.getCost());
    }
}