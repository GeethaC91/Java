import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("********TESTCASE STARTED*******");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("********TEST SUCCESS*******");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("********TEST FAILED*******");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("********TEST SKIPPED*******");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("********TEST SUCCESS*******");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("********TEST SUITE STARTED*******");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("********TEST COMPLETE*******");
    }
}
