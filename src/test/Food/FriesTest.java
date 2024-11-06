package Food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FriesTest {

    @Test
    void getCost() {
        Fries fries = new Fries();

        assertEquals(3.25, fries.getCost());
    }
}