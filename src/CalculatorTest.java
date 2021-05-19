import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
      calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        float expectedResult = 13;
        float actualResult = calculator.addition(5.0f, 8.0f);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void subtraction() {
    }

    @Test
    public void multiply() {
    }

    @Test
    public void dividing() {
    }
}