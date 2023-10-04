package invocationCount;

import org.testng.annotations.Test;

public class InvocationEx {
        @Test(invocationCount = 10)
        public void testcase1() {
            System.out.println("Running testcase 1");
        }
    @Test(invocationCount = 10)
    public void testcase2() {
        System.out.println("Running testcase 2");
    }
}


