package gr2.aueb.cf;

/**
 * Διαιρεση με το 0.
 */

public class DivideZeroApp {

    public static void main(String[] args) {
        double dividend = 17.0;
        double divisor = 0.0;
        double result = 0.0;

        result = dividend / divisor;

        System.out.println("Result = " + result);
    }
}
