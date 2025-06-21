public class logger {
    // Step 1: Create a private static instance of the class
    private static logger instance;

    // Step 2: Make the constructor private so that new objects cannot be created from outside
    private logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public static method to get the instance
    public static logger getInstance() {
        if (instance == null) {
            instance = new logger();  // Lazy initialization
        }
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
