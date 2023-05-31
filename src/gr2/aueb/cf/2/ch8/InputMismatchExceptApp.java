package gr2.aueb.cf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
            try {
                System.out.println("Please insert a num");

                inputNum = in.nextInt();

                if (inputNum == MAGIC_NUM) {
                    System.out.println("Great!");
                    break;
                }
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                in.nextLine();
                System.out.println("Error. Please insert an int");
            }
        }
        System.out.println("Thanks for using the Magic App");

        }

    }

