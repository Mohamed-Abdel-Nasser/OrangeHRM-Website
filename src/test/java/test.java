import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.openApplication;

public class test extends BaseTest {
    openApplication app;

    @BeforeMethod
    public void setUp() {
        app = new openApplication(driver);
    }

    @Test
    public void dfsvh() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("your_username")
                .Password("your_password")
                .clickLoginButton();
    }

    @Test
    public void dfdsvh() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("your_username")
                .Password("your_password")
                .clickLoginButton();
    }

    @Test
    public void dfgbsvh() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("dsf")
                .Password("fsd")
                .clickLoginButton();
    }

    @Test
    public void dfssvh() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("dsf")
                .Password("fsd")
                .clickLoginButton();
    }

    @Test
    public void dfsssvh() {
        app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("dsf")
                .Password("fsd")
                .clickLoginButton();
    }
}