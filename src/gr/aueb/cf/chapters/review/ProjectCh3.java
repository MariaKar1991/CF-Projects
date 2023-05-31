package gr.aueb.cf.chapters.review;


import java.util.Scanner;

/** Iteratively shows a multi-choice menu. The users select
 * a choice and gets feedback, or Q/Q and quit.
 * It handles common exceptions such as NumberFormatException
 * or IllegalArgumentException that although are runtime exceptions
 * are recoverable in this case. The menu choices are:
 * 1.Insert
 * 2.Update
 * 3.Delete
 * 4.Search
 * Q/q. Quit
 */
public class ProjectCh3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response = "";

        do {
            printMenu();
            response = getChoice();
            try {
                if (response.matches("[Qq]")) {
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice");
            }
        } while (!quit);
    }

    public static void printOnChoice(String s) {
        int choice = -1;

        try {
            choice = Integer.parseInt(s);

            switch (choice) {
                case 1:
                    System.out.println("1.Insert");
                    break;
                case 2:
                    System.out.println("2.Update");
                    break;
                case 3:
                    System.out.println("3.Delete");
                    break;
                case 4:
                    System.out.println("4.Select");
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
        System.out.println("Q or q to Quit");
    }
}
