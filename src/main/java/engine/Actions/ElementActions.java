package engine.Actions;

import engine.LOGGER.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementActions {

    private static final LogManager LOGGER = LogManager.getInstance(); // Logger instance
    private static ElementActions elementActions;
    private WebDriver driver;
    private static engine.Actions.WaitActions wait;

    private ElementActions(WebDriver driver) {
        this.driver = driver;
    }

    public static ElementActions getInstance(WebDriver driver) {
        if (elementActions == null) {
            elementActions = new ElementActions(driver);
        }
        return elementActions;
    }

    public void fieldType(By element, String text) {
        try {
            driver.findElement(element).sendKeys(text);
            LOGGER.info("Typed text: " + text + " in field located by " + element);
        } catch (Exception e) {
            LOGGER.error("Error typing text: " + text + " in field located by " + element + ". Error: " + e.getMessage());
        }
    }

    public void clickElement(By element) {
        try {
            driver.findElement(element).click();
            LOGGER.info("Clicked on element located by " + element);
        } catch (Exception e) {
            LOGGER.error("Error clicking on element located by " + element + ". Error: " + e.getMessage());
        }
    }
}
