package gr2.aueb.cf;

/**
 * keeps running until a sentinel value is provided
 */

import java.util.Scanner;

public class SentinelApp {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int num = 0;
       int iterations = 0;

        System.out.println("Please provide a num");
        num = in.nextInt();

        while (num != 0) {
//            System.out.println(num);
            iterations++;
            System.out.println("Please provide a num");
            num = in.nextInt();
        }
    }
}
