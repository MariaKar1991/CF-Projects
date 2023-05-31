package gr2.aueb.cf;

import java.util.Scanner;

/** Gets a user's choice based on a menu
 * and returns a feedback/confirmation
 */

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

            System.out.println("Please select one of the following:");
            System.out.println("1.One-player game");
            System.out.println("2.Two-player game");
            System.out.println("3.Team game");
            System.out.println("4.Quit");
            System.out.println("1.Please provide a choice");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-player game");
                    break;
                case 2:
                    System.out.println("Start two-player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;

            }
        }
    }

