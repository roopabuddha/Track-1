import com.zeta.test.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestCalculator {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator instance created");
    }

    @Test
    void testAdd() {
        assertEquals(3,calculator.add(1,2));
    }

    @Test
    void testSubtract() {
        assertEquals(-5,calculator.subtract(1,2));
    }

    @Test
    void testMultiply() {
        assertEquals(15,calculator.multiply(5,3));
    }

    @Test
    void testDivide() {
        assertEquals(5,calculator.divide(2,1));
    }

    @Test
    void testDivideByZero() {
        assertEquals(0,calculator.divide(0,0));
    }

    @Test
    void testDivideByZeroExpception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(0,0));
        assertEquals("Division by zero not allowed",exception.getMessage());
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Tear down: Calculator instance destroyed\n");
    }
}
