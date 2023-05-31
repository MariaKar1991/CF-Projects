package gr.aueb.cf.chapters.ch6;

/**
 * App that finds the maximum position and value,
 * of an int-array element, otherwise returns -1.
 * The app is based on a generic method approach.
 */
public class ArrayMaxGenericMethod {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr, 0 , arr.length -1);

        // Using maxPosition + 1 (user-friendly)
        System.out.printf("Maximum Value: %d, Max Position: %d", arr[maxPosition], maxPosition + 1);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue = 0;

        if ((arr == null ||arr.length == 0 || low < 0 || high > arr.length -1 || low > high)) {
            return -1; // Invalid input, return -1 indicating error
        }

        int max = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }

        return maxPosition;
    }
}
