package engine.FrameworkConstants;

import engine.DataDriven.PropertiesManager;

public class FrameworkConstants {

    public static String testingLink;
    public static String browser;
    public static String executionType;
    public static String userName;
    public static String password;

    // Static block to load the configuration
    static {
        PropertiesManager.loadConfig();  // Ensure the configuration is loaded before using any properties
        testingLink = PropertiesManager.getPropertyValue("url");
        browser = PropertiesManager.getPropertyValue("browser");
        executionType = PropertiesManager.getPropertyValue("executionType");
        userName = PropertiesManager.getPropertyValue("UserName");
        password = PropertiesManager.getPropertyValue("Password");
    }
}
