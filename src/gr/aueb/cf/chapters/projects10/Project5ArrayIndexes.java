package gr.aueb.cf.chapters.projects10;

/**
 * The Project5ArrayIndexes class provides methods to find the low and high indexes of a key in a sorted integer array.
 */
public class Project5ArrayIndexes {

/**
* Finds the low and high indexes of a key in a sorted integer array.
*
* @param arr The sorted integer array to search.
* @param key The key to find the indexes for.
* @return An array containing the low and high indexes of the key. If the key is not found, returns [-1, -1].
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = binarySearch(arr, key, true);
        int high = binarySearch(arr, key, false) - 1;

        if (low <= high) {
            return new int[]{low, high};
        } else {
            return new int[]{-1, -1};
        }
    }

/**
* Performs a binary search to find the index of a key in a sorted integer array.
*
* @param arr           The sorted integer array to search.
* @param key           The key to search for.
* @param findLowIndex  A boolean flag indicating whether to find the low index (true) or high index (false) of the key.
* @return The index of the key. If the key is not found, returns -1.
     */
    private static int binarySearch(int[] arr, int key, boolean findLowIndex) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;

                if (findLowIndex) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

/**
* The main method demonstrates the usage of the getLowAndHighIndexOf method.
*/
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] indexes = getLowAndHighIndexOf(arr, key);
        System.out.println("Low Index: " + indexes[0]);
        System.out.println("High Index: " + indexes[1]);
    }
}
