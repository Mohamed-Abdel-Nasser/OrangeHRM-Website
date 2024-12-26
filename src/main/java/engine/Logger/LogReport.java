package engine.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LogReport {

    private static volatile LogReport instance;
    private static Logger logger;
    private static final String LOG4J_CONFIG_FILE = "src/main/resources/XML/log4j2.xml";

    // Private constructor to prevent instantiation
    private LogReport() {
        configureLogger();
    }

    // Singleton pattern with double-checked locking
    public static LogReport getInstance() {
        if (instance == null) {
            synchronized (LogReport.class) {
                if (instance == null) {
                    instance = new LogReport();
                }
            }
        }
        return instance;
    }

    // Initialize the logger once
    private void configureLogger() {
        if (logger == null) {
            Configurator.initialize(null, LOG4J_CONFIG_FILE);
            logger = LogManager.getLogger(LogReport.class);
        }
    }

    // Log info level messages
    public void logInfo(String message) {
        logger.info(message);
    }

    // Log error level messages with optional exception stack trace
    public void logError(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    // Log warning level messages
    public void logWarning(String message) {
        logger.warn(message);
    }

    // Log fatal level messages with optional exception stack trace
    public void logFatal(String message, Throwable throwable) {
        logger.fatal(message, throwable);
    }
}
