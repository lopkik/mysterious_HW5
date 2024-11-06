package Order;

import Food.FoodItem;
import Food.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasicOrderTest {

    @Test
    void addFoodItem() {
        BasicOrder order = new BasicOrder();
        assertEquals(0, order.getTotalOrderCost());

        FoodItem hotdog = new HotDog();
        order.addFoodItem(hotdog);
        assertEquals(1.50, order.getTotalOrderCost());
    }

    @Test
    void getTotalOrderCost() {
        BasicOrder order = new BasicOrder();
        assertEquals(0, order.getTotalOrderCost());
    }
}