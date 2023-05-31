package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Counts the number of positives
 * numbers given by the user
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please give a num (int)");
        num = in.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Please give a num (int)");
            num = in.nextInt();
        }

        System.out.println("Positive-count: " + positivesCount);
    }
}
