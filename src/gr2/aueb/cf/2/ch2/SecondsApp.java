package gr2.aueb.cf;

import java.util.Locale;
import java.util.Scanner;

/**
 * Διαβαζει ωρες, λεπτα και δευτερολεπτα απο τον χρηστη
 * και τα μετατρεπει σε δευτερολεπτα
 */
public class SecondsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert hours, minutes and seconds");
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf(Locale.US,"%d hours, %d minutes, %d seconds = %,d total seconds",
                inputHours, inputMinutes, inputSeconds, totalSeconds );

        }
}