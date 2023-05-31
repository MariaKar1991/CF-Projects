package gr.aueb.cf.chapters.ch8;

import java.util.Scanner;

public class MenuException1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            printMenu();
            choice = getChoice(scanner);
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
    }

    public static int getChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5:");
                scanner.next(); // consume non-integer input
            }
        }
        return choice;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {
        if (choice < 1 || choice > 5) {
            switch (choice) {
                case 1:
                    System.out.println("You chose Option 1");
                    break;
                case 2:
                    System.out.println("You chose Option 2");
                    break;
                case 3:
                    System.out.println("You chose Option 3");
                    break;
                case 4:
                    System.out.println("You chose Option 4");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");
            }
            System.out.println("You chose option " + choice + ".");
        }
    }


}