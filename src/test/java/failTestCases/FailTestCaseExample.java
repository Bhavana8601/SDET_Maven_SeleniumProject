package failTestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestCaseExample {
    @Test
    public void testCaseA(){
        Assert.assertTrue(true);
    }
    @Test
    public void testCaseB(){
        Assert.assertTrue(true);
    }
    @Test
    public void testCaseC(){
        Assert.assertTrue(true);
    }
    @Test
    public void testCaseD(){
        Assert.assertTrue(false);
    }
    @Test
    public void testCaseE(){
        Assert.assertTrue(false);
    }
}
