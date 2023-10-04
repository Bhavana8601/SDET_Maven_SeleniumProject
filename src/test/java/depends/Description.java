package depends;

import org.testng.annotations.Test;

public class Description {
    @Test(description = "Verify Home Page functionality")
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }
    @Test(description = "Verify Send Request functionality")
    public void verifySendRequest() {
        System.out.println("Verify Send  Request");
    }
}
