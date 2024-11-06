package Toppings;

import Food.FoodItem;
import Food.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodItemWithPicklesTest {

    @Test
    void getCost() {
        FoodItem hotdog = new FoodItemWithPickles(new HotDog());

        assertEquals(3.50, hotdog.getCost());
    }
}