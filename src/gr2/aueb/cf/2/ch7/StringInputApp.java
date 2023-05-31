package gr2.aueb.cf;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("PLease provide a string");
        //s = in.next();
        s = in.nextLine();

        System.out.println(s);
    }
}
