package gr.aueb.cf.cf.applications;

import java.io.IOException;

/**
 * Char input with System.in.read()
 */

public class CharInputApp {
    public static void main(String[] args) throws IOException {
        int inputChar = ' '; // returns the ordinal value of the char

        System.out.println("Please insert an ASCII char");
        inputChar = System.in.read(); // reads one byte as int

        System.out.println("char: " + (char) inputChar);

    }
}
