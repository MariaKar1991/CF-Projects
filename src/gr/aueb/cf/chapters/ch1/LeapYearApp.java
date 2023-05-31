package gr.aueb.cf.chapters.ch1;

import java.util.Scanner;

/**
 *  App that calculates if the user input (int) is a leap year.
 *  Leap year = 366 days
 *  Leap year = (year % 4 == 0) && (year % 100 != 0 || year % 400)
 */
public class LeapYearApp {
    public static void main(String[] args) {

        // Variable Declaration and Initialization
        Scanner in = new Scanner(System.in);
        boolean isLeapYear = false;
        int year = 0;

        // Commands - Enter the year as input
        System.out.println("Please Enter a Year: ");
        year = in.nextInt();

        // divisible by 4
        isLeapYear = (year % 4 == 0);

        // divisible by 4, not by 100, or divisible by 400
        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

        // Display Results
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

