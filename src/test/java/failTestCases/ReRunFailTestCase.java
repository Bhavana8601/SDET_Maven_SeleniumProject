package failTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailTestCase implements IRetryAnalyzer {
    public static int max = 3;
    public static int min = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (min < max) {
            min ++;
            return true;
        }
        return false;
    }
}
