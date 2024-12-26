import org.testng.annotations.Test;
import pages.openApplication;

public class test extends BaseTest {
    openApplication app = new openApplication(driver);

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
        openApplication app = new openApplication(driver);
                app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("your_username")
                .Password("your_password")
                .clickLoginButton();
    }

    @Test
    public void dfgbsvh(){
        openApplication app = new openApplication(driver);
                app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("dsf")
                .Password("fsd")
                .clickLoginButton();
    }

    @Test
    public void dfssvh(){
        openApplication app = new openApplication(driver);
                app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("dsf")
                .Password("fsd")
                .clickLoginButton();
    }
    @Test
    public void dfsssvh(){
        openApplication app = new openApplication(driver);
                app.navigateToURL(driver)
                .returnLoginScreen(driver)
                .UserName("dsf")
                .Password("fsd")
                .clickLoginButton();
    }
}

