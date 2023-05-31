package gr.aueb.cf.chapters.review;

import java.util.Scanner;

/**
 * Prints stars in several patterns (horizontally,
 * vertically, nxn, nXn ascending, nXn descending.
 */
public class ProjectCh5 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String s = "";
        do {
            printMenu();
            s = getChoice();
            try {
                if (s.matches("[qQ]")) quit = true;
                else printOnChoice(s);
            } catch (IllegalArgumentException e) {
                System.out.println("Error in input");
            }
        } while (!quit);
    }

    public static void printOnChoice(String s) {
        int choice = -1;
        int n = 0;

        try {
            choice = Integer.parseInt(s);
            if ((choice >= 1) && (choice <= 5)) {
                System.out.println("Please insert number of stars");
                n = Integer.parseInt(getChoice());
            }

            switch (choice) {
                case 1:
                    System.out.println("1. Print Stars Horizontal");
                    printStarsH(n);
                    break;
                case 2:
                    System.out.println("2. Print Stars Vertical");
                    printStarsV(n);
                    break;
                case 3:
                    System.out.println("3. Print stars Horizontal/Vertical");
                    printStarsHV(n);
                    break;
                case 4:
                    System.out.println("4. Print stars Horizontal/Vertical Ascending");
                    printStarsHVAsc(n);
                    break;
                case 5:
                    System.out.println("5. Print stars Horizontal/Vertical Descending");
                    printStarsHVDesc(n);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String getChoice() {
        return in.nextLine();
    }

    public static void printMenu() {
        System.out.println("Please select one of the following:");
        System.out.println("1.Insert");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.Select");
        System.out.println("1.Q or q to Quit");

    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println("*");
        }
    }

    public static void printStarsHVAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println("*");
        }
    }

    public static void printStarsHVDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
            System.out.println("*");
        }
    }
}
