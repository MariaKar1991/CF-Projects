package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Δινουμε start, end και step
 * και εκτυπωνει αντιστοιχα αστερακια
 */

public class StarsStepApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        System.out.println("Please insert start, end value and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        i = start;
        while (i <= end) {
            System.out.println("*");
            i = i + step;
        }

    }
}
