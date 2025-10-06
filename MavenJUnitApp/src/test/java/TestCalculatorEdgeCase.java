import com.zeta.test.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculatorEdgeCase {
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class,()->calculator.divide(5,0));
    }
    @Test
    public void testLargeNumberAddition() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MAX_VALUE,calculator.add(Integer.MAX_VALUE,0));
    }

    @Test
    void testEmptyStringLength() {
        assertEquals(0,"".length());
    }
}
