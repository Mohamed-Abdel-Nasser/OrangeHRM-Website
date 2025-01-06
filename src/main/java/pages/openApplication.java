package pages;

import engine.FrameworkConstants.FrameworkConstants;
import engine.LOGGER.LogManager;
import org.openqa.selenium.WebDriver;
import pages.elements.LogInScreenInstances;


public class openApplication {

    protected WebDriver driver;
    private final LogManager LOGGER = LogManager.getInstance();

    public openApplication(WebDriver driver) {
        this.driver = driver;
        String successMessage = "Application setup is complete. Ready to proceed.";
        LOGGER.info(successMessage);
    }

    public openApplication navigateToURL(WebDriver driver) {
        String navigatingMessage = "Opening the application. Navigating to: " + FrameworkConstants.testingLink;
        LOGGER.info(navigatingMessage);
        try {
            driver.navigate().to(FrameworkConstants.testingLink);
            String successMessage = "Application opened successfully at: " + FrameworkConstants.testingLink;
            LOGGER.info(successMessage);
        } catch (Exception e) {
            String errorMessage = "Unable to open the application. Please check your connection or URL. Details: " + e.getMessage();
            LOGGER.error(errorMessage);
        }
        return this;
    }

    public LogInScreenInstances returnLoginScreen(WebDriver driver) {
        String infoMessage = "Preparing the login screen for user interaction.";
        LOGGER.info(infoMessage);
        try {
            LogInScreenInstances loginScreen = LogInScreenInstances.getInstance(driver);
            String successMessage = "Login screen is ready for use.";
            LOGGER.info(successMessage);
            return loginScreen;
        } catch (Exception e) {
            String errorMessage = "Unable to display the login screen. Please try again. Details: " + e.getMessage();
            LOGGER.error(errorMessage);
            return null;
        }
    }
}
