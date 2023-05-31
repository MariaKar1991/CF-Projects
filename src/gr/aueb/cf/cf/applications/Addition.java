package gr.aueb.cf.cf.applications;

import java.util.Scanner;

/**
 *  Addition program that inputs two numbers
 *  then displays their sum
 */
public class Addition {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = in.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = in.nextInt();

        int sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    }
}
