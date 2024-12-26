import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public  WebDriver driver;

    @BeforeSuite
    public void initDriver(){
        if(driver==null) {
            driver = new ChromeDriver();
        }
    }

    @BeforeMethod
    public void beforeEachTest() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
        }
    }

    @AfterMethod
    public void refreshBrowser() {
        if (driver != null) {
            driver.navigate().refresh();
        }
    }

    @AfterSuite
    public void closeDriver(){
        if (driver != null) {
            driver.quit();
        }
    }

}
