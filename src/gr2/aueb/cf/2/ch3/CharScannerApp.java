package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Reads a character with Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Please insert a char");
        inputChar = in.nextLine().charAt(0);

        System.out.println("Input char: " + inputChar);

    }
}
