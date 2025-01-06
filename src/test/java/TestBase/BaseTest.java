package TestBase;

import engine.BrowserDriverFactory.BrowserDriverFactory;
import engine.FrameworkConstants.FrameworkConstants;
import engine.LOGGER.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public WebDriver driver;
    private final LogManager LOGGER = LogManager.getInstance(); // Initialize the logger instance

    @BeforeSuite
    public void initDriver() {
        if (driver == null) {
            LOGGER.info("Initializing browser driver...");

            BrowserDriverFactory browserDriverFactory = new BrowserDriverFactory();
            driver = browserDriverFactory.createDriver(FrameworkConstants.browser, FrameworkConstants.executionType);

            if (driver != null) {
                LOGGER.info("Driver initialized successfully for browser: " + FrameworkConstants.browser);
            } else {
                LOGGER.error("Failed to initialize the driver.");
            }
        }
    }

    @BeforeMethod
    public void beforeEachTest() {
        if (driver != null) {
            LOGGER.info("Deleting all cookies before test execution.");
            driver.manage().deleteAllCookies();
        } else {
            LOGGER.error("Driver is not initialized. Unable to delete cookies.");
        }
    }

    @AfterMethod
    public void refreshBrowser() {
        if (driver != null) {
            LOGGER.info("Refreshing the browser after test.");
            driver.navigate().refresh();
        } else {
            LOGGER.error("Driver is not initialized. Unable to refresh the browser.");
        }
    }

    @AfterSuite
    public void closeDriver() {
        if (driver != null) {
            LOGGER.info("Closing the browser after all tests.");
            driver.quit();
            LOGGER.info("Browser closed successfully.");
        } else {
            LOGGER.error("Driver is not initialized. Unable to close the browser.");
        }
    }
}
