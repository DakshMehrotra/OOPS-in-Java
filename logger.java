// Final class to prevent inheritance
final class Logger {
    // Method to log messages
    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}
// This will result in a compilation error because Logger is final
class ExtendedLogger extends Logger {
    public void logWarning(String warning) {
        System.out.println("Warning: " + warning);
    }
}
public class MainClass {
    public static void main(String[] args) {
        // Creating an object of Logger class
        Logger logger = new Logger();
        
        // Calling the logMessage method
        logger.logMessage("This is a log message.");
    }
}
