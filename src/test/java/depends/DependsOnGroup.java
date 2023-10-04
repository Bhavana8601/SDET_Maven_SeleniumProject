package depends;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"Smoke"})
    public void verifyLogin() {
        System.out.println("Verify Login");
        Assert.assertFalse(true);
    }
    @Test
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }
    @Test(dependsOnGroups = {"Smoke"})
    public void verifySendARequest() {
        System.out.println("Verify Send Request");
    }
    @Test
    public void verifyReviewProfile() {
        System.out.println("Verify Review Profile");
    }
}

