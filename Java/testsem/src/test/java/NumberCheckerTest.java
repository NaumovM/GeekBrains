import sem3hw.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberCheckerTest {

    @Test
    public void testNumberInRange() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.checkNumberInRange(50));
    }

    @Test
    public void testNumberBelowRange() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkNumberInRange(10));
    }

    @Test
    public void testNumberAboveRange() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkNumberInRange(150));
    }

    @Test
    public void testNumberEqualToLowerBound() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkNumberInRange(25));
    }

    @Test
    public void testNumberEqualToUpperBound() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkNumberInRange(100));
    }

}
