package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Repeatedly displays a menu with options,
 * until the user selects exit.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ενα απο τα παρακατω");
            System.out.println("1. Εισαγωγη προιοντος");
            System.out.println("2. Διαγραφη προιοντος");
            System.out.println("3. Εξοδος");
            System.out.flush();
            choice = in.nextInt();

        } while (choice != 3);
    }
}
