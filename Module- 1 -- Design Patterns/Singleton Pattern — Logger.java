

class Logger {
    private static Logger instance;

    private Logger() { } // private constructor

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("App started");
        System.out.println(logger1 == logger2); // true, same instance
    }
}
