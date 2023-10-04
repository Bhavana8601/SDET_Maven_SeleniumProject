package depends;

import org.testng.annotations.Test;

public class Enable {
    @Test(description = "Verify Home Page functionality")
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }
    @Test(enabled = false)
    public void verifySendRequest() {
        System.out.println("Verify Send  Request");
    }
}

