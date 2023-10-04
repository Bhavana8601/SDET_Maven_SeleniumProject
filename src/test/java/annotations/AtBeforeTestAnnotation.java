package annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AtBeforeTestAnnotation {
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("It will be executed first");
    }
    @Test
    public void softwareDevelopers()
    {
        System.out.println("Software Developers");
    }

    @Test
    public void softwareTesters()
    {
        System.out.println("Software Testers");
    }
}
