package pages;

import engine.FrameworkConstants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import pages.elements.LogInScreenInstances;

public class openApplication {

    protected WebDriver driver;

    public openApplication(WebDriver driver){
        this.driver = driver;
    }

    public openApplication navigateToURL(WebDriver driver){
        driver.navigate().to(FrameworkConstants.testingLink);
        return this;
    }

    public LogInScreenInstances returnLoginScreen(WebDriver driver){
        return LogInScreenInstances.getInstance(driver);
    }
}
