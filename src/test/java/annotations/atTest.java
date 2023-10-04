package annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class atTest {
    @Test
    public void testcase1(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}

