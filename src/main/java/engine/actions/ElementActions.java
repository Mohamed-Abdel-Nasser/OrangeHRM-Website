package engine.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class ElementActions {
private static final Logger logger = Logger.getLogger(ElementActions.class.getName());
    private static ElementActions elementActions;
    private WebDriver driver;

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
        Waits.explicitWait(driver, 20, ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).sendKeys(text);
//        LogReport.getInstance().logInfo("Type text: " + text + " in field: " + element);
        logger.info("Type text: " + text + " in field: " + element);
    }

    public void clickElement(By element) {
        Waits.explicitWait(driver, 20, ExpectedConditions.visibilityOfElementLocated(element));
        Waits.explicitWait(driver, 20, ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
//        LogReport.getInstance().logInfo("Click on element: " + element);
        logger.info("Click on element: " + element);
    }

}
