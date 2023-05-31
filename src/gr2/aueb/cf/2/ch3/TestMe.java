package gr2.aueb.cf;

import java.util.Scanner;

public class TestMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Print n stars horizontally");
            System.out.println("2. Print n stars vertically");
            System.out.println("3. Print n lines with n stars");
            System.out.println("4. Print n lines with stars 1 to n");
            System.out.println("5. Print n lines with stars n to 1");
            System.out.println("6. Exit the program");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of stars: ");
                    int n1 = input.nextInt();
                    printStarsHorizontally(n1);
                    break;
                case 2:
                    System.out.print("Enter the number of stars: ");
                    int n2 = input.nextInt();
                    printStarsVertically(n2);
                    break;
                case 3:
                    System.out.print("Enter the number of lines: ");
                    int n3 = input.nextInt();
                    printLinesWithNStars(n3);
                    break;
                case 4:
                    System.out.print("Enter the number of lines: ");
                    int n4 = input.nextInt();
                    printLinesWithStars1ToN(n4);
                    break;
                case 5:
                    System.out.print("Enter the number of lines: ");
                    int n5 = input.nextInt();
                    printLinesWithStarsNTo1(n5);
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
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
