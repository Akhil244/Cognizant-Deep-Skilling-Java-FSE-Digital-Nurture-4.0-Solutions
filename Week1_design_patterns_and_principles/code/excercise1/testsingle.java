public class testsingle {
    public static void main(String[] args) {
        // Try to get Logger instance multiple times
        logger l1 = logger.getInstance();
        logger l2 = logger.getInstance();

        l1.log("This is the first log message.");
        l2.log("This is the second log message.");

        // Test if both references point to the same object
        if (l1 == l2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist! Singleton pattern failed.");
        }
    }
}
