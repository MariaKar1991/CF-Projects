package gr.aueb.cf.cf.applications;

import java.util.Scanner;

public class RupeesToDollars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rupees = 0;

        System.out.println("Please enter rupees: ");
        rupees = in.nextLong();

        float dollars = rupees / 64;

        System.out.println(dollars + " Dollars");

    }
}
