package gr.aueb.cf.chapters.projects10;

import java.util.Arrays;

/**
 * The Project4MaxCars class calculates the maximum number of cars parked simultaneously based on their arrival and departure times.
 */
public class Project4MaxCars {
/**
* The main method calculates the maximum number of cars parked simultaneously.
*/
    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        int[][] timeArray = new int[arr.length * 2][2];
        int index = 0;

        for (int[] car : arr) {
            timeArray[index][0] = car[0];
            timeArray[index][1] = 1; // 1 indicates arrival
            index++;

            timeArray[index][0] = car[1];
            timeArray[index][1] = 0; // 0 indicates departure
            index++;
        }

        Arrays.sort(timeArray, (a, b) -> a[0] - b[0]);

        int maxCars = 0;
        int currentCars = 0;

        for (int[] time : timeArray) {
            if (time[1] == 1) {
                currentCars++;
                maxCars = Math.max(maxCars, currentCars);
            } else {
                currentCars--;
            }
        }

        System.out.println("Maximum number of cars parked simultaneously: " + maxCars);
    }
}
