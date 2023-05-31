package gr2.aueb.cf;

/**
 * Υπολογιζει το αθροισμα και μετα το
 * γινομενο των 10 πρωτων ακεραιων
 */

public class SumAndMul10App {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
