package gr2.aueb.cf;

/**
 * Υπολογιζει και εκτυπωνει το αθροισμα και το γινομενο
 * των πρωτων 10 αριθμων
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