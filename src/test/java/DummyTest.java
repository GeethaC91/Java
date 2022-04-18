import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.*;

public class DummyTest {
    static int i =1;
    @BeforeSuite
    @Parameters({"url"})
    public void setUpOnSuite(String url) {
        System.out.println("Before Suite");
        System.out.println(url);
    }

    @BeforeTest
    @Parameters({"url"})
    public void beforeTest(String url1) {
        System.out.println("Before Test");
        System.out.println(url1);
    }

    @BeforeClass
    @Parameters({"url"})
    public void beforeClass(String url2) {
        System.out.println("Before Class");
        System.out.println(url2);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(enabled=true,groups={"sanity"})
    @Parameters({"url"})
    public void testCase1(String url) {
        System.out.println("Testcase1");
        System.out.println(url);
    }

    @Test(groups={"regression"},dependsOnGroups = "sanity")
    public void testCase2() {
        System.out.println("Testcase2");
        //int i = 9/0;
    }

    @Test(dependsOnMethods = {"testCase2"},enabled=true,groups={"regression"})
    public void testCase3() {
        System.out.println("Testcase3");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after Method");
    }
}
