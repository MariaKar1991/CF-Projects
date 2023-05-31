package gr2.aueb.cf;

import java.util.Scanner;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 5;
        int num2 = 1;
        int result;

        System.out.println("Please insert");
        num1 = in.nextInt();
        num2 = in.nextInt();

        //try {
        //  result = num1 / num2;
        //} catch (ArithmeticException e) {
        //    System.out.println("Please ...");
        //}

        if ( num2 == 0) {
            System.out.println("Please");
            System.exit(1);
        }

        result = num1 / num2;

        //System.out.println(result);
    }
}
