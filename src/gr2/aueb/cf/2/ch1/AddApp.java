package gr2.aueb.cf;

/**
 * Προσθετει δυο ακεραιους
 * και εμφανιζει το αποτελεσμα στο
 * stdout.
 */
public class AddApp {

    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        // Εντολες
        result = num1 + num2;


        // Εκτυπωση αποτελεσματων
        System.out.println("Το αποτελεσμα των " + num1 + ", " + num2 + " ειναι " + result);
        System.out.printf("Το αποτελεσμα των %d, %d ειναι %d", num1, num2, result);
    }
}
