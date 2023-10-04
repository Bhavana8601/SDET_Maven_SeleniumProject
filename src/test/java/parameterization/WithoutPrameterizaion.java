package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WithoutPrameterizaion {
    @Test
    public void verifyGooglewebsite() {
        SoftAssert softAssert= new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com/");
        driver.manage().window().maximize();
        WebElement ID = driver.findElement(By.id("APjFqb"));
        ID.sendKeys("Selenium" + "Pune");
        ID.sendKeys(Keys.ENTER);
        driver.close();
    }
}

