package gr.aueb.cf.chapters.projects10;
/**
 * The algorithm works by iterating through the array arr starting from the second element.
 * At each index, it calculates the maximum sum subArray ending at that index.
 * The currentMax variable keeps track of the maximum sum subArray ending at the current index,
 * while the globalMax variable stores the overall maximum sum subArray found so far.
 *
 * For each index i, the currentMax is updated by taking the maximum value between the current element arr[i]
 * and the sum of the current element and the previous maximum subArray sum currentMax + arr[i].
 * This step considers whether it is beneficial to extend the previous subArray or start a new subArray from the current element.
 *
 * The globalMax is updated by taking the maximum value between the previous globalMax and the updated currentMax.
 * This ensures that the overall maximum sum subArray is tracked throughout the iteration.
 *
 * Finally, the globalMax is returned, representing the maximum sum subArray in the given array.
 *
 * In the main function, an example array arr is defined, and the findMaximumSumSubArray method is called to find
 * the maximum sum subArray. The result is then printed to the console.
 *
 * The time complexity of this algorithm is O(n) since it iterates through the array once, performing constant time operations at each step.
 */
public class Project6MaximumSumSubArray {
    public static int findMaximumSumSubArray(int[] arr) {
        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maximumSum = findMaximumSumSubArray(arr);
        System.out.println("Maximum Sum SubArray: " + maximumSum);
    }
}
