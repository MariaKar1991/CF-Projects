package gr.aueb.cf.chapters.ch2;

import java.util.Scanner;

/**
 * Prints the user input horizontally.
 * User input = number of stars.
 */
public class StarsHorizontalApp {

    public static void main(String[] args) {

        // Variable declaration and initialization
        Scanner in = new Scanner(System.in);
        int n = 0;

        // Commands - enter the number of stars
        System.out.println("Please insert n");
        n = in.nextInt();

        // Displays Results
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1; j++) {
            }

                System.out.print("*");
        }

    }
}
