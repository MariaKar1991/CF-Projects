package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Prints n (times) horizontal stars, where n is an integer
 * given by the user.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;

        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        while (i <= numberOfStars) {
            System.out.print("*");
            i++;
        }
    }
}
