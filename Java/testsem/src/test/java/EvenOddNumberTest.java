import sem3hw.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        EvenOddNumber numberChecker = new EvenOddNumber();
        assertTrue(numberChecker.evenOddNumber(2));
    }

    @Test
    public void testOddNumber() {
        EvenOddNumber numberChecker = new EvenOddNumber();
        assertFalse(numberChecker.evenOddNumber(3));
    }

    @Test
    public void testZero() {
        EvenOddNumber numberChecker = new EvenOddNumber();
        assertTrue(numberChecker.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        EvenOddNumber numberChecker = new EvenOddNumber();
        assertTrue(numberChecker.evenOddNumber(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        EvenOddNumber numberChecker = new EvenOddNumber();
        assertFalse(numberChecker.evenOddNumber(-7));
    }

}