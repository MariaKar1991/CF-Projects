package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Asks the user for three integers,
 * decreases them by one unit as well
 * appears in the same order as given
 * leaving a gap between them
 */
public class ThreeNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1--;
        num2--;
        num3--;

        System.out.printf("%d %d %d", num1, num2, num3);
    }
}

