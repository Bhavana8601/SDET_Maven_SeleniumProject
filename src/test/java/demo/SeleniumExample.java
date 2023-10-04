package demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeleniumExample {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com/");
        driver.manage().window().maximize();

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Admin\\Downloads\\flower_"+timetamp()+"jpg");
        FileUtils.copyFile(src, dest);
        driver.close();
    }
    public static String timetamp(){
        return new SimpleDateFormat("YYYY-MM-DD-SS").format(new Date());
    }
}
