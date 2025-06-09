package oop.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogMeFile {
    public static void main(String[] args) throws IOException {
        FileHandler file = new FileHandler("logs/log.txt");
        Logger logger = Logger.getLogger(LogMeFile.class.getName());
        logger.addHandler(file);

        logger.severe("TEST");

    }
}
