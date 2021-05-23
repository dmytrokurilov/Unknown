import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
      calculator = new Calculator();
    }

    @Test
    public void testAdditionPositiveValues() {
        float expectedResult = 13;
        float actualResult = calculator.addition(5.0f, 8.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testAdditionNegativeAndPositiveValues() {
        float expectedResult = 10;
        float actualResult = calculator.addition(-5.0f, 15.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testAdditionNegativeValues() {
        float expectedResult = -30;
        float actualResult = calculator.addition(-20.0f, -10.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testSubtractionPositiveValues() {
        float expectedResult = 30;
        float actualResult = calculator.subtraction(40.0f, 10.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testSubtractionPositiveAndNegativeValues() {
        float expectedResult = 50;
        float actualResult = calculator.subtraction(40.0f, -10.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testSubtractionNegativeValues() {
        float expectedResult = -30;
        float actualResult = calculator.subtraction(-40.0f, -10.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testMultiplyPositiveValues() {
        float expectedResult = 40;
        float actualResult = calculator.multiply(10.0f, 4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testMultiplyPositiveAndNegativeValues() {
        float expectedResult = -40;
        float actualResult = calculator.multiply(-10.0f, 4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testMultiplyNegativeValues() {
        float expectedResult = 40;
        float actualResult = calculator.multiply(-10.0f, -4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testDividingPositiveValues() {
        float expectedResult = 40;
        float actualResult = calculator.dividing(160.0f, 4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testDividingPositiveAndNegativeValues() {
        float expectedResult = -40;
        float actualResult = calculator.dividing(160.0f, -4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testDividingNegativeValues() {
        float expectedResult = 40;
        float actualResult = calculator.dividing(-160.0f, -4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testEquationSolutionAddition() throws IOException {
        float expectedResult = 40;
        float actualResult = calculator.equationSolution(10.0f, "+", 30.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testEquationSolutionSubtraction() throws IOException {
        float expectedResult = 40;
        float actualResult = calculator.equationSolution(50.0f, "-", 10.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testEquationSolutionMultiply() throws IOException {
        float expectedResult = 40;
        float actualResult = calculator.equationSolution(10.0f, "*", 4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void testEquationSolutionDividing() throws IOException {
        float expectedResult = 40;
        float actualResult = calculator.equationSolution(160.0f, "/", 4.0f);
        Assert.assertEquals(expectedResult, actualResult, 0.000001);
    }
}