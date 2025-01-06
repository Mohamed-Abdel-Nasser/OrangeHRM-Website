package engine.DataDriven;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import engine.LOGGER.LogManager;

import java.io.File;
import java.io.IOException;

public class PropertiesManager {

    private static final String PATH = "src/main/resources/properties/testEnvironmentConfig.json";
    private static JsonNode configData;
    private static final LogManager LOGGER = LogManager.getInstance();

    // Method to load the JSON configuration
    public static void loadConfig() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            configData = objectMapper.readTree(new File(PATH));
            LOGGER.info("Successfully loaded configuration from JSON file.");
        } catch (IOException e) {
            LOGGER.error("Error loading configuration from JSON file");
        }
    }

    // Method to retrieve a property value from the loaded JSON
    public static String getPropertyValue(String key) {
        if (configData == null) {
            LOGGER.error("Configuration has not been loaded yet.");
            throw new IllegalStateException("Configuration has not been loaded yet.");
        }

        // Handle nested credentials
        if (key.equals("UserName") || key.equals("Password")) {
            JsonNode credentialsNode = configData.get("credentials");
            if (credentialsNode != null) {
                JsonNode valueNode = credentialsNode.get(key);
                if (valueNode == null) {
                    LOGGER.error("Property not found: " + key);
                    throw new IllegalArgumentException("Property '" + key + "' not found.");
                }
                String value = valueNode.asText();
                LOGGER.info("Retrieved property: " + key + " = " + value);
                return value;
            }
        }

        // Handle non-nested properties
        JsonNode valueNode = configData.get(key);
        if (valueNode == null) {
            LOGGER.warn("Property not found: " + key);
            throw new IllegalArgumentException("Property '" + key + "' not found.");
        }

        String value = valueNode.asText();
        LOGGER.info("Retrieved property: " + key + " = " + value);
        return value;
    }
}
