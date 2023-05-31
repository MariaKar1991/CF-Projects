package gr2.aueb.cf;

import java.util.Scanner;

/**
 *  Αποφασιζει αν χιονιζει με βαση την θερμοκρασια,
 * αν η θερμοκρασια ειναι < 0 τοτε χιονιζει, αλλιως δεν
 * χιονιζει.ο χρηστης δινει την θερμοκρασια
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
