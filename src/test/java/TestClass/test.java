package TestClass;

import TestBase.BaseTest;
import engine.FrameworkConstants.FrameworkConstants;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.openApplication;

public class test extends BaseTest {
   private static openApplication app;
   private static FrameworkConstants constants;

    @BeforeMethod
    public void setUp() {
        app = new openApplication(driver);
        constants = new FrameworkConstants(driver);
    }

    @Test(priority = 1)
    public void testValidLogin() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName(FrameworkConstants.userName)
                .Password(FrameworkConstants.password)
                .clickLoginButton();
    }

    @Test(priority = 2)
    public void testInvalidEmailWithoutDomain() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("invalidemail")
                .Password("validPassword123")
                .clickLoginButton();
    }

    @Test(priority = 3)
    public void testInvalidEmailWithInvalidCharacters() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("invalid@em#ail.com")
                .Password("validPassword123")
                .clickLoginButton();
    }

    @Test(priority = 4)
    public void testInvalidEmailWithMissingAtSymbol() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("invalidemail.com")
                .Password("validPassword123")
                .clickLoginButton();
    }

    @Test(priority = 5)
    public void testInvalidEmailWithMultipleAtSymbols() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("invalid@@email.com")
                .Password("validPassword123")
                .clickLoginButton();
    }

    @Test(priority = 6)
    public void testLoginWithEmptyPasswordField() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("valid.email@example.com")
                .Password("")
                .clickLoginButton();
    }

    @Test(priority = 7)
    public void testLoginWithPasswordBelowMinimumLength() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("valid.email@example.com")
                .Password("short")
                .clickLoginButton();
    }

    @Test(priority = 8)
    public void testLoginWithPasswordAboveMaximumLength() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("valid.email@example.com")
                .Password("ThisPasswordIsWayTooLongToBeValid1234567890")
                .clickLoginButton();
    }

    @Test(priority = 9)
    public void testLoginWithPasswordContainingSpecialCharacters() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("valid.email@example.com")
                .Password("Pa$$w0rd!@#")
                .clickLoginButton();
    }

    @Test(priority = 10)
    public void testLoginWithPasswordContainingLeadingAndTrailingSpaces() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("valid.email@example.com")
                .Password("  validPassword123  ")
                .clickLoginButton();
    }

    @Test(priority = 11)
    public void testLoginWithCaseSensitiveIncorrectPassword() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("valid.email@example.com")
                .Password("VALIDpassword123")
                .clickLoginButton();
    }

}
