package depends;

import org.testng.annotations.Test;

public class DependentTestExamples {
        @Test(dependsOnMethods = { "testTwo", "testThree" })
        public void testOne() {
            System.out.println("Test method one");
        }
        @Test
        public void testTwo() {
            System.out.println("Test method two");
        }
        @Test
        public void testThree() {
            System.out.println("Test method three");
        }
}

