package gr.aueb.cf.chapters.ch6;

/**
 * App that finds/prints the second-smallest element of an int-array,
 * otherwise returns an error message.
 */
public class SecondSmallestApp {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8};
        if (arr == null || arr.length < 2) {
            System.out.println("Invalid input"); // Invalid input, print error message
            return;
        }
        int smallest = arr[0];
        int secondSmallest = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
