package parameterization;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {
    public static WebDriver driver;
    @DataProvider(name = "Data")
    public Object[][] dataproviderfunction() throws IOException {
        Object[][] arrObj = getExcelData("C:/Users/Admin/Documents/Test Example.xlsx","Demo1");
        return arrObj;
    }
    public String[][] getExcelData(String filepath, String sheetname) throws IOException {
        String[][] data = null;

        FileInputStream fileInputStream = new FileInputStream(filepath);
         XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet Sheet = wb.getSheet(sheetname);
        XSSFRow row = Sheet.getRow(0);
        int noofrows = Sheet.getPhysicalNumberOfRows();
        int noofcols = row.getLastCellNum();
        Cell cell;
        data = new String[noofrows-1][noofcols];
        for(int i = 1;i<noofrows; i++) {
        for ( int j =0; j<noofcols; j++){
            row = Sheet.getRow(i);
            cell = row.getCell(j);
            data[i-1][j] = cell.getStringCellValue();
        }
        }
        return data;
    }
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
    @Test(dataProvider = "Data")
    public void verifyGoogleWebsite(String courseName,String cityName){
        WebElement ID = driver.findElement(By.id("APjFqb"));
        ID.sendKeys(courseName + cityName);
        ID.sendKeys(Keys.ENTER);
        driver.close();
    }
}
