import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DummyTest1 {
    static int i =0;
    @Test(invocationCount = 5,successPercentage = 50)
    public void testCase4() {
        System.out.println("Testcase4");
        i++;
        if(i%2==0)
        {
            Assert.fail();
        }
    }
    @Test(expectedExceptions = {ArithmeticException.class})
    public void testCase5()
    {
        int a =2/0;
    }
    @Test(dataProvider="LoginProvider")
    public void testCase6(String userName,String pwd,String secQuestion)
    {
        System.out.println(userName+" "+" "+pwd+" "+secQuestion);
    }
    @DataProvider
    public Object[][] LoginProvider()
    {
        Object[][] data={
                {"geetha","1234","dog"},
                {"radha","2345","Kerala"}
        };
        return data;
    }
}
