package gr.aueb.cf.chapters.ch2;

import java.util.Scanner;
/**
 *  Prints n lines of n stars in each line.
 *  n = user input
 */
public class StarsLinesApp {

    public static void main(String[] args) {

        // Variable declaration and initialization
        Scanner in = new Scanner(System.in);
        int n = 0;


        // Commands - enter the number of stars
        System.out.println("Please insert n");
        n = in.nextInt();

        // Displays Results
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}



