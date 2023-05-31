package gr2.aueb.cf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/cf.txt"), true , StandardCharsets.UTF_8)) {
           ps.println("Καλησπέρα!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
