import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void calculatorCanAdd(){
        Calculator calculator = new Calculator(2,3);
        assertEquals(5, calculator.add());
    }

    @Test
    public void calculatorCanSubtract(){
        Calculator calculator = new Calculator(4,3);
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void calculatorCanMultiply(){
        Calculator calculator = new Calculator(4,3);
        assertEquals(12, calculator.multiply());
    }

    @Test
    public void calculatorCanDivide(){
        Calculator calculator = new Calculator(6,3);
        assertEquals(2, calculator.divide());
    }
}
