package gr2.aueb.cf;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/test1.txt");
             PrintWriter pw = new PrintWriter("C:/tmp/test2.txt")) {
            ps.println("Hello CF! from print stream");
            ps.println("Hello CF! from print writer");
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}