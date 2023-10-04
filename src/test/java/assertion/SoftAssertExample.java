package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifyfacebookwebsite() {
        SoftAssert softAssert= new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("email"));
        softAssert.assertTrue(element.isDisplayed(),"element textbox should be displayed");
        softAssert.assertEquals(driver.getTitle(), "facebook – log in or sign up", "Your title should be match");
        softAssert.assertAll();
        driver.close();
    }
}
