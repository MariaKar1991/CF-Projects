package gr2.aueb.cf;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/tmp/cf.txt");

        printMessage(ps, "Hello World!");
        printMessage(System.out, "Hello Coding Factory");

    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
