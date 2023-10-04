package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AtAfterTestAnnotation {
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
    @AfterTest
    public void afterTest()
    {
        System.out.println("It will be executed Last");
    }
}

