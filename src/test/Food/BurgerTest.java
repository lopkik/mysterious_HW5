package Food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {

    @Test
    void getCost() {
        Burger burger = new Burger();

        assertEquals(5.50, burger.getCost());
    }
}