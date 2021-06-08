import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void canMultiply() {
        assertEquals(8, calculator.multiply(4, 2));
    }
    @Test
    public void canDivide() {
        assertEquals(5.0, calculator.divide(10, 2), 0.0);
    }
}
