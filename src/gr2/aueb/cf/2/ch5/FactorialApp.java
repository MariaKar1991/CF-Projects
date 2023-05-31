package gr2.aueb.cf;

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Please insert n (int)");
        n = in.nextInt();

        result = facto(n);

        System.out.printf("%d! = %d", n, result);

    }

    /**
     * Returns n!
     *
     * @param n   the number (n) of n!
     * @return    1 * 2 * 3 .... * n.
     */

    public static int facto(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
