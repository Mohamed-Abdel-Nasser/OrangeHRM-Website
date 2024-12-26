package engine.BrowserDriverFactory;

import engine.FrameworkConstants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BrowserDriverFactory {

    private final String browserType = FrameworkConstants.browser.trim().toLowerCase();
    private final String executionType = FrameworkConstants.executionType.trim().toLowerCase();

    public WebDriver createDriver() {
        switch (browserType) {
            case "chrome":
                return createChromeDriver();
            case "edge":
                return createEdgeDriver();
            case "firefox":
                return createFirefoxDriver();
//            case "safari":
//                return createSafariDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }

    private WebDriver createChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        configureOptions(options);
        return new ChromeDriver(options);
    }

    private WebDriver createEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        configureOptions(options);
        return new EdgeDriver(options);
    }

    private WebDriver createFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        configureOptions(options);
        return new FirefoxDriver(options);
    }

//    private WebDriver createSafariDriver() {
//        SafariOptions options = new SafariOptions();
//        configureOptions(options);
//        return new SafariDriver(options);
//    }


    private void configureOptions(Object options) {
        if (executionType.equals("local headless")) {
            if (options instanceof ChromeOptions) {
                ((ChromeOptions) options).addArguments("--headless");
            } else if (options instanceof EdgeOptions) {
                ((EdgeOptions) options).addArguments("--headless");
            } else if (options instanceof FirefoxOptions) {
                ((FirefoxOptions) options).addArguments("--headless");
            } //else if (options instanceof SafariOptions) {
            //((SafariOptions) options).addArguments("--headless");
        } else {
            throw new IllegalArgumentException("Unsupported browser options type: " + options.getClass().getName());

        }
    }
}
