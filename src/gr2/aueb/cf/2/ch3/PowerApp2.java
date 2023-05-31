package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Calculates a^b, 
 * e.g 2^3 = 8
 * Reads a and b from the user.
 */
public class PowerApp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        System.out.println("Please insert a, b (ints)");
        a = in.nextInt();
        b = in.nextInt();

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.printf("%d^%d = %d", a, b, result);
    }
}

