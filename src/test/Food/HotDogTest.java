package Food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotDogTest {

    @Test
    void getCost() {
        HotDog hotdog = new HotDog();

        assertEquals(1.50, hotdog.getCost());
    }
}