import Food.BurgerTest;
import Food.FriesTest;
import Food.HotDogTest;
import LoyaltyStatus.CustomerLoyaltyStatusTest;
import Order.BasicOrderTest;
import Toppings.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({BurgerTest.class, FriesTest.class, HotDogTest.class, CustomerLoyaltyStatusTest.class, BasicOrderTest.class, FoodItemWithKetchupTest.class, FoodItemWithOnionsTest.class, FoodItemWithPicklesTest.class})
public class SuiteTest {
}
