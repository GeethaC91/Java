import org.testng.annotations.*;

public class DummyTest {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }
    @Test
    public void testCase1()
    {
        System.out.println("Testcase1");
    }
    @Test
    public void testCase2()
    {
        System.out.println("Testcase2");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("after Class");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after Method");
    }
}
