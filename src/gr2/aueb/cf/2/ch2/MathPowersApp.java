package gr2.aueb.cf;


/**
 * Βρισκει το τετραγωνο και τον κυβο
 * ενος ακεραιου που δινει ο χρηστης
 */

import java.util.Scanner;

public class MathPowersApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num (int)");
        inputNum = in.nextInt();

        System.out.printf("num: %d, square: %d, cube: %d",
                inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));

    }
}
