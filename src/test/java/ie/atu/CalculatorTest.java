package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp() { calc = new Calculator(); }

    @Test
    public void testAdd_Success() { assertEquals(20, calc.add(16,4)); }

    @Test
    public void testAdd_fail()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to Integer.MAX_VALUE", ex.getMessage());
    }
}
