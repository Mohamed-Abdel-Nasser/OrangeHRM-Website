package engine.LOGGER;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LogManager {

    private static final String RESET = "\u001B[0m";  // Reset color
    private static final String GREEN = "\u001B[32m";   // Green color
    private static final String BLUE = "\u001B[34m";    // Blue color
    private static final String YELLOW = "\u001B[33m";  // Yellow color
    private static final String RED = "\u001B[31m";     // Red color
    private static final String MAGENTA = "\u001B[35m";  // Magenta color
    private static final String LOG4J_CONFIG_FILE = "src/main/java/engine/LOGGER/log4j2.xml";
    private static LogManager instance;
    private static Logger logger;

    // Private constructor to prevent instantiation
    private LogManager() {
        configureLogger();
    }

    // Singleton pattern with double-checked locking
    public static LogManager getInstance() {
        if (instance == null) {
            synchronized (LogManager.class) {
                if (instance == null) {
                    instance = new LogManager();
                }
            }
        }
        return instance;
    }

    // Initialize the logger once
    private void configureLogger() {
        if (logger == null) {
            Configurator.initialize(null, LOG4J_CONFIG_FILE);
            logger = org.apache.logging.log4j.LogManager.getLogger(LogManager.class);
        }
    }

//    //TODO: Log info level messages
//    public void info(String message) {
//        logger.info(message);
//    }
//
//    //TODO: Log error level messages with optional exception stack trace
//    public void error(String message) {
//        logger.error(message);
//    }
//
//    //TODO: Log warning level messages
//    public void warn(String message) {
//        logger.warn(message);
//    }
//
//    //TODO: Log fatal level messages with optional exception stack trace
//    public void logFatal(String message) {
//        logger.fatal(message);
//    }


    public void info(String message) {
        String coloredMessage = GREEN + message + RESET;
        logger.info(coloredMessage);
    }

    public void debug(String message) {
        String coloredMessage = BLUE + message + RESET;
        logger.debug(coloredMessage);
    }

    public void warn(String message) {
        String coloredMessage = YELLOW + message + RESET;
        logger.warn(coloredMessage);
    }

    public void error(String message) {
        String coloredMessage = RED + message + RESET;
        logger.error(coloredMessage);
    }

    public void fatal(String message) {
        String coloredMessage = MAGENTA + message + RESET;
        logger.fatal(coloredMessage);
    }
}