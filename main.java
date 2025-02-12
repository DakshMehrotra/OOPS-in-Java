//This is the 4th code
// File: Logger.java
final class Logger {  // Logger class is declared as final
    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// File: ExtendedLogger.java (This will cause a compile-time error)
/*
class ExtendedLogger extends Logger { // Trying to extend a final class
    // ... any methods in ExtendedLogger ...
}
*/

// File: Main.java
public class Main {
    public static void main(String[] args) {
        Logger myLogger = new Logger(); // Create an object of the Logger class
        myLogger.logMessage("This is a sample log message."); // Call the logMessage method

         // The following would cause an error if ExtendedLogger was not commented out:
        /*
        ExtendedLogger extLogger = new ExtendedLogger(); // This will cause an error
        extLogger.logMessage("Log from extended logger.");
        */
    }
}
