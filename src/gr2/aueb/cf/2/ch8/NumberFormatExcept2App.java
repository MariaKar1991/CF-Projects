package gr2.aueb.cf;

import java.util.Scanner;

public class NumberFormatExcept2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = "";
        int inputNum = 0;


        System.out.println("Please insert an int");
        inputStr = in.nextLine();
        if (isInt(inputStr)) {
            inputNum = Integer.parseInt(inputStr);
            System.out.println("Input num: " + inputNum);
        } else {
            System.out.println("Please ");
        }

    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
