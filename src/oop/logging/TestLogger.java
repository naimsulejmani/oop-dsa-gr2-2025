package oop.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {
    private static Logger logger = Logger.getLogger(TestLogger.class.getName());

    public static void main(String[] args) {
        try {
            logger.info("Info message");
            int x = 1 / 0;
        } catch (Exception e) {
            logger.severe(e.getMessage());
            logger.log(Level.SEVERE, "Sosht tragjike pjestim me njo mo", e);
        }
    }
}
