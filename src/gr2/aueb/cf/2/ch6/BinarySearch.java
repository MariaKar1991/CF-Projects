package gr2.aueb.cf;

public class BinarySearch {

    public static void main(String[] args) {
        final int KEY = 12;
        int[] arr = {1, 5, 7, 8, 9, 12};
        int low = 0;
        int high = arr.length -1;
        int position;

        position = binarySearch(arr, KEY, low, high);

        System.out.printf("Position: %d, Value: %d", (position + 1), arr[position]);

    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        int median;

        if (arr == null) return -1;
        if ((low < 0) || (high > arr.length -1)) return -1;
        if (high < low) return -1;

        median = (low + high) / 2;

        if (value == arr[median]) {
            return median;

        }

        if (value < arr[median]) {
            return binarySearch(arr, value, low, median -1);
        } else {
            return binarySearch(arr, value, median + 1, high);
        }
    }
}
