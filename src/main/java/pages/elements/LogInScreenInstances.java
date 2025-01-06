package pages.elements;

import engine.Actions.ElementActions;
import engine.Actions.WaitActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.openApplication;

public class LogInScreenInstances extends openApplication {

    private static WebDriver driver;
    private static final By USERNAME_FIELD = By.name("username");
    private static final By PASSWORD_FIELD = By.name("password");
    private static final By LOGIN_BTN = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    private static LogInScreenInstances logInScreen;

    public LogInScreenInstances(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }

    public static LogInScreenInstances getInstance(WebDriver driver) {
        if (logInScreen == null) {
            logInScreen = new LogInScreenInstances(driver);
        }
        return logInScreen;
    }


    public LogInScreenInstances UserName(String text) {
        WaitActions.waitForElement(driver, 20, USERNAME_FIELD, "visible");
        ElementActions.getInstance(driver).fieldType(USERNAME_FIELD, text);
        return this;
    }


    public LogInScreenInstances Password(String text) {
        WaitActions.waitForElement(driver, 20, PASSWORD_FIELD, "visible");
        ElementActions.getInstance(driver).fieldType(PASSWORD_FIELD, text);
        return this;
    }

    public LogInScreenInstances clickLoginButton() {
        WaitActions.waitForElement(driver, 20, LOGIN_BTN, "clickable");
        ElementActions.getInstance(driver).clickElement(LOGIN_BTN);
        return this;
    }
}
