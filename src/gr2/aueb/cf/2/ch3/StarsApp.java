package gr2.aueb.cf;

import java.util.Scanner;

/**
 *  Εκτυπωνει n οριζοντια αστερακια, οπου n ειναι ενας ακεραιος
 *  που δινει ο χρηστης
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
