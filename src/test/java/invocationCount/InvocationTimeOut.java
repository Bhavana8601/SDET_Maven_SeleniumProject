package invocationCount;

import org.testng.annotations.Test;

public class InvocationTimeOut {
    @Test(invocationCount = 50, invocationTimeOut = 3)
    public void testOne() {
        System.out.println("Test method one");
    }
    @Test(invocationCount = 10, invocationTimeOut = 2)
    public void testTwo() {
        System.out.println("Second test method ");
    }
}
