package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionEx {
    @Test
    public void testcase1(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testcase2(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://flipkart.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testcase3(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://amazon.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testcase4(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
