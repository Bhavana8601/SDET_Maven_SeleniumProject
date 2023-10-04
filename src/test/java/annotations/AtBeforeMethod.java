package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtBeforeMethod {
    public static WebDriver driver;
    @BeforeMethod
    public void beforemethod(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testcase1(){
        driver.navigate().to("https://flipkart.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testcase2(){
        driver.navigate().to("https://amazon.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testcase3(){
        driver.navigate().to("https://facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
