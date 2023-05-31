package gr2.aueb.cf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("/java/algorithms books/test1.txt", StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory. Γεια!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
