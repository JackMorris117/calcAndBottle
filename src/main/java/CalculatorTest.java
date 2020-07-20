import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;


    @Before
    public void before() {
        this.calculator = new Calculator(5, 2, 9.9, 2);
    }

    @Test
    public void add() {assertEquals(7, calculator.addNum());}

    @Test
    public void subtract() {assertEquals(3, calculator.subtractNum());}

    @Test
    public void multiply() {assertEquals(10, calculator.multiplyNum());}

    @Test
    public void divide() {assertEquals(4.95, calculator.divideNum(),0.01);}


}
