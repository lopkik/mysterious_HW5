package LoyaltyStatus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerLoyaltyStatusTest {

    @Test
    void getDiscountCost() {
        double baseCost = 100.0;
        CustomerLoyaltyStatus bronzeStatus = new CustomerLoyaltyStatus(CustomerLoyaltyStatus.LoyaltyStatus.BRONZE);
        CustomerLoyaltyStatus silverStatus = new CustomerLoyaltyStatus(CustomerLoyaltyStatus.LoyaltyStatus.SILVER);
        CustomerLoyaltyStatus goldStatus = new CustomerLoyaltyStatus(CustomerLoyaltyStatus.LoyaltyStatus.GOLD);

        assertEquals(baseCost - 2.5, bronzeStatus.getDiscountCost(baseCost));
        assertEquals(baseCost - 5.0, silverStatus.getDiscountCost(baseCost));
        assertEquals(baseCost - 10.00, goldStatus.getDiscountCost(baseCost));
    }
}