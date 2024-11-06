package LoyaltyStatus;

public class CustomerLoyaltyStatus {
    public enum LoyaltyStatus {
        BRONZE,
        SILVER,
        GOLD
    }
    private final LoyaltyStatus loyaltyStatus;

    public CustomerLoyaltyStatus (LoyaltyStatus loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public double getDiscountCost (double originalCost) {
        if (this.loyaltyStatus.equals(LoyaltyStatus.BRONZE)) {
            return Math.max(0, originalCost - 2.50);
        } else if (loyaltyStatus.equals(LoyaltyStatus.SILVER)) {
            return Math.max(0, originalCost - 5.00);
        } else if (loyaltyStatus.equals(LoyaltyStatus.GOLD)) {
            return Math.max(0, originalCost - 10.00);
        } else {
            return originalCost;
        }
    }

}
