package gr.aueb.cf.chapters.review;


/**
 * Finds the position in an array of the
 * max element of the array.
 */
public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 8, 5, 9, 14};
        int maxPos;


        maxPos = getMaxPosition(arr, 0, arr.length-1);
        if (maxPos == -1) System.exit(1);
        System.out.println(arr[maxPos]);
    }

    /**
     *  Returns the position of the max element
     *
     * @param arr   the source array
     * @param low   the low index (lowest is 0)
     * @param high  the high index (highest is length - 1)
     * @return      the position of the max element
     */

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue = 0;

        if ((arr == null) || (arr.length < 1))
            return -1;
        if ((low < 0) || (high > arr.length - 1) || (low > high)) {
            return -1;
        }

        maxValue = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }

        return maxPosition;
    }
}
