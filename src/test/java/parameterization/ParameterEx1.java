package parameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx1 {
    public static WebDriver driver;
    @Parameters("browsername")
    @BeforeMethod
    public void beforeMethodEx(String browsername) {
        if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please select correct browser");
        }
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }
        @Parameters({"courseName","cityName"})
         @Test
        public void verifyGoogleWebsite(String courseName,String cityName){
            WebElement ID = driver.findElement(By.id("APjFqb"));
            ID.sendKeys(courseName + cityName);
            ID.sendKeys(Keys.ENTER);
            driver.close();
        }
    }


