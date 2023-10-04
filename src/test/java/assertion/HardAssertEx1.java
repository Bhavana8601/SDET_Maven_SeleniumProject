package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx1 {
    @Test
    public void testcase1() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("email"));
        Assert.assertTrue(element.isDisplayed(),"element textbox should be displayed");
       driver.close();
    }
}
