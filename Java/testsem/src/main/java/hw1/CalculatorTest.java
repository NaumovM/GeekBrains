package hw1;
import org.assertj.core.api.Assertions; //на моих зависимостях тесты проходят.
import org.junit.Test;
public class CalculatorTest {
    @Test
    public void testCalculateDiscountWithValidArguments() {
        float purchaseAmount = 100;
        float discountPercentage = 10;

        float discountedAmount = Calculator.calculateDiscount(purchaseAmount, discountPercentage);

        float expectedDiscountedAmount = 90;
        Assertions.assertThat(discountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        float purchaseAmount = -100;
        float discountPercentage = 10;

        Calculator.calculateDiscount(purchaseAmount, discountPercentage);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithInvalidDiscountPercentage() {
        float purchaseAmount = 100;
        float discountPercentage = -10;

        Calculator.calculateDiscount(purchaseAmount, discountPercentage);
    }
}