package gr.aueb.cf.chapters.ch1;

import  java.util.Scanner;
/**
 *  App that displays a Menu with 6 choices,
 *  and prints stars according to the user's input.
 *  The program stops when the user selects the 6th choice.
 */
public class StarPrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Δώσε επιλογή: ");

            choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Δώστε αριθμό για αστεράκια: ");
                    int n1 = in.nextInt();
                    printStarsHorizontally(n1);
                    break;
                case 2:
                    System.out.print("Δώστε αριθμό για αστεράκια: ");
                    int n2 = in.nextInt();
                    printStarsVertically(n2);
                    break;
                case 3:
                    System.out.print("Δώστε αριθμό για γραμμές: ");
                    int n3 = in.nextInt();
                    printLinesWithNStars(n3);
                    break;
                case 4:
                    System.out.print("Δώστε αριθμό για γραμμές: ");
                    int n4 = in.nextInt();
                    printLinesWithStars1ToN(n4);
                    break;
                case 5:
                    System.out.print("Δώστε αριθμό για γραμμές: ");
                    int n5 = in.nextInt();
                    printLinesWithStarsNTo1(n5);
                    break;
                case 6:
                    System.out.println("Έξοδος από το πρόγραμμα");
                    break;
                default:
                    System.out.println("Λάθος Επιλογή.Παρακαλώ δοκιμάστε ξανά.");
            }
        } while (choice != 6);
    }

    public static void printStarsHorizontally(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsVertically(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void printLinesWithNStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printLinesWithStars1ToN(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printLinesWithStarsNTo1(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



