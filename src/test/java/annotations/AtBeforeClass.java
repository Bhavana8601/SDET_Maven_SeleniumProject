package annotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AtBeforeClass {
    @BeforeClass
    public void beforeclass() {
        System.out.println("These are programming languages");
    }
    @Test
    public void testcase1() {
        System.out.println("C");
    }
    @Test
    public void testcase2() {
        System.out.println("Java");
    }
    @Test
    public void testcase3() {
        System.out.println("c++");
    }
}

