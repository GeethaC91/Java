
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeSuite
    public void setUp() throws Exception {
        System.out.println("Setup suite level");
        calculator = new Calculator();
    }

    @Test
    public void sumTest() {
        int expectation = 3;
        int outcome = calculator.sum(2, 1);
        Assert.assertEquals(expectation, outcome);
        Assert.assertEquals(-4,calculator.sum(-2,-2));
        Assert.assertEquals(0,calculator.sum(2,-2));
        Assert.assertEquals(-3,calculator.sum(-5,2));
    }
    @Test
    public void MultiplyTest()
    {
        Assert.assertEquals(4,calculator.multiply(2,2));
        Assert.assertEquals(1,calculator.multiply(-1,-1));
        Assert.assertEquals(-2,calculator.multiply(-1,2));
        Assert.assertEquals(0,calculator.multiply(0,-1));
    }

    @AfterSuite
    public void tearDownOnSuite()
    {
        System.out.println("tear down at Suite level");
    }
   // @Test( actual = RuntimeException.class, timeout = 200)
    //public void DivideTest(){
      //  Assert.assertEquals(0,calculator.divide(8,0));
    //}


}
