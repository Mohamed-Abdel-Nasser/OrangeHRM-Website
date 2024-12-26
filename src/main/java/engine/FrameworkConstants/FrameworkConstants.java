package engine.FrameworkConstants;

import engine.dataDriven.PropertiesManager;

public class FrameworkConstants {
    public static String testingLink = PropertiesManager.getPropertiesValue("URL");
    public static String browser = PropertiesManager.getPropertiesValue("browser");
    public static String executionType = PropertiesManager.getPropertiesValue("executionType");
    public static String userName = PropertiesManager.getPropertiesValue("UserName");
    public static String password = PropertiesManager.getPropertiesValue("Password");

    static {
        PropertiesManager.loadAllFiles();
    }
}
