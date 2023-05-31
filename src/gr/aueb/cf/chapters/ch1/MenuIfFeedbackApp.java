package gr.aueb.cf.chapters.ch1;

import java.util.Scanner;

/**
 * App that prints a Menu and gives a feedback according
 * to the user input, until the user selects exit.
 */

public class MenuIfFeedbackApp {

    public static void main(String[] args) {

        // Variable Declaration and Initialization
        Scanner in = new Scanner(System.in);
        int choice = 0;

        // Commands
        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω ή 5 για έξοδο: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();
            // Display Results
        if (choice == 1) {
            System.out.println("Επιλέξατε Εισαγωγή");
        } else if (choice == 2) {
            System.out.println("Επιλέξατε Διαγραφή");
        } else if (choice == 3) {
            System.out.println("Επιλέξατε Ενημέρωση");
        } else if (choice == 4) {
            System.out.println("Επιλέξατε Αναζήτηση");
        } else if (choice == 5) {
            System.out.println("Επιλέξατε Έξοδος");
        } else {
            System.out.println("Λάθος επιλογή");
        }
    } while (choice != 5);

    System.out.println("Goodbye");
  }
}


