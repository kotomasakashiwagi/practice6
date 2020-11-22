import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void calculateDualTest(){
        assertEquals(4,Calculator.calculateDual(2));
        assertEquals(4,Calculator.calculateDual(-2));
        assertEquals(0,Calculator.calculateDual(0));
    }

    @Test
    public void createKuKuStep() {
        List<Integer> kuKu3step = Calculator.createKuKuStep(3);
        assertEquals(3,kuKu3step.get(0));
        assertEquals(24,kuKu3step.get(7));
        assertEquals(9,kuKu3step.size());

    }

    @Test
    public void isPrimeNumber() {
        assertFalse(Calculator.isPrimeNumber(27));
        assertTrue(Calculator.isPrimeNumber(29));
    }


}