package gr.aueb.cf.chapters.ch8;

import java.util.Scanner;

public class MenuException {

     /**
      *  Catches the exception, and gives to the user
      *  a relative message.
      */
        public static void main(String[] args) {
            try {
                int choice = getChoice();
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ δώστε έναν αριθμό από 1 έως 5.");
            }
        }

       /**
        *  Menu with options (1 to 4) and 5 for Exit.
        */
        public static void printMenu() {
            System.out.println("Επιλέξτε μια επιλογή:");
            System.out.println("1. Επιλογή 1");
            System.out.println("2. Επιλογή 2");
            System.out.println("3. Επιλογή 3");
            System.out.println("4. Επιλογή 4");
            System.out.println("5. Exit");
        }

       /**
        * Reads user's choice with Scanner.
        */
        public static int getChoice() {

            Scanner scanner = new Scanner(System.in);

            while (true) {
                printMenu();
                // Checks if the input is an integer.
                if (scanner.hasNextInt()) {
                    int choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 5) {
                        return choice;
                    }
                } else {
                // Reads the invalid input, in order to continue to the next try
                    scanner.next();
                }
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
            }
        }

        /**
         * Prints user's choice,if the choice is not 1-5 the
         * method throws an IllegalArgumentException.
         */
         public static void printChoice(int choice) {
            if (choice >= 1 && choice <= 4) {
                System.out.println("Επιλέξατε την επιλογή: " + choice);
            } else if (choice == 5) {
                System.out.println("Επιλέξατε Exit. Το πρόγραμμα τερματίζει.");
            } else {
                throw new IllegalArgumentException();
            }
        }
    }


