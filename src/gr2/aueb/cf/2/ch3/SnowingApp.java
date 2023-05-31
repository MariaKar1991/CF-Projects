package gr2.aueb.cf;

import java.util.Scanner;

/** Decides whether it's snowing or not, based on not only 
 * the temperature but also whether it is raining.
 * If it is raining and the temperature is < 0, 
 * then it is snowing, otherwise it's doesn't.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining(true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature(int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
