package gr2.aueb.cf;

import java.io.IOException;

public class CharInputApp {
    public static void main(String[] args) throws IOException {
        char inputChar = ' ';

        System.out.println("Please insert an ASCII char");
        inputChar = (char) System.in.read();

        System.out.println("char: " + inputChar);
    }
}
