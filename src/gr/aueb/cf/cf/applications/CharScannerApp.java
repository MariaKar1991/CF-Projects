package gr.aueb.cf.cf.applications;

import java.util.Scanner;

/**
 * διαβαζει char με Scanner.
 */
public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        inputChar = in.nextLine().charAt(0);

        System.out.println("Input char: " + inputChar);

    }
}
