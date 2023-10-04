package priority;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 'A',groups = {"Smoke"})
    public void testcase1() {
        System.out.println("A");
    }
    @Test(priority = -2)
    public void testcase2() {
        System.out.println("Z");
    }
    @Test(priority = 1)
    public void testcase3() {
        System.out.println("Y");
    }
}

