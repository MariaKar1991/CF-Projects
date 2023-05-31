package gr2.aueb.cf;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JULApp {

    public static void main(String[] args) {
        try {
            Scanner sc = getFileDescriptor("C:\\tmp\\test-15.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public static Scanner getFileDescriptor(String s) throws FileNotFoundException {
        File fd = new File(s);
        Logger logger = getLogger();

        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            logger.severe("File not found" + e.getMessage());
            throw e;
        }

    }

    public static Logger getLogger() {
        Logger logger = Logger.getLogger(JULApp.class.getName());
        Handler fileHandler;


        try {
            fileHandler = new FileHandler("cf.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.addHandler(fileHandler);
        return logger;
    }


}
