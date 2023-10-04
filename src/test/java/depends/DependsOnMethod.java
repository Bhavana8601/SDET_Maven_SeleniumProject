package depends;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void verifyLogin() {
        System.out.println("Verify Login");
        Assert.assertFalse(true);
    }
    @Test(dependsOnMethods = {"verifyLogin"} )
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }
    @Test(dependsOnMethods = {"verifyLogin"} )
    public void verifySendARequest() {
        System.out.println("Verify Send Request");
    }
    @Test(dependsOnMethods = {"verifyLogin"} )
    public void verifyReviewProfile() {
        System.out.println("Verify Review Profile");
    }
}

