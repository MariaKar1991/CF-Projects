package gr.aueb.cf.cf.applications;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = in.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = in.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }
        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }

    }

}