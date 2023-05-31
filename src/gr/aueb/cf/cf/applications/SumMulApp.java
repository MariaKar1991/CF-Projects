package gr.aueb.cf.cf.applications;

/**
 * Υπολογιζει και εκτυπωνει το αθροισμα και γινομενο
 * των 10 πρωτων αριθμων.
 */

public class SumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;

        }
        System.out.println("Sum is: " + sum);
        System.out.println("Mul is: " + mul);
    }
}