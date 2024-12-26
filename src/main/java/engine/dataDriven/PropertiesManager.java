package engine.dataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class PropertiesManager {
    private static final String PATH = "src/main/resources/properties/";
    private static final Properties PROPERTIES = new Properties();

    public static Properties loadAllFiles() {
        List<String> filesList = List.of("Credintials", "Path", "Setup");
        for (String file : filesList) {
            try (FileReader fileReader = new FileReader(PATH + file + ".properties")) {
                PROPERTIES.load(fileReader);
            } catch (IOException e) {
                System.err.println("Error loading file: " + file + ".properties");
                e.printStackTrace();
            }
        }
        return PROPERTIES;
    }


    public static String getPropertiesValue(String value) {
        return PROPERTIES.getProperty(value);
    }
}
