package gr2.aueb.cf;

import java.util.Scanner;

/**
 * Decides if it's snowing based on the temperature,
 * if the temperature is < 0 then it snows, otherwise it doesn't.
 * the user provides the temperature.
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
