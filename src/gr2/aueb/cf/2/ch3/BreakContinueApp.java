package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Indicates the use of breaks
 * and continue
 */
public class BreakContinueApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();
            if (num == 5) {
                continue;
            }
            sum += num;
            if (num == 10) {
                System.out.println("Bingo!!!");
                break;
            }

        }
        System.out.println("Sum: " + sum);
    }

}
