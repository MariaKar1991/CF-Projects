package gr.aueb.cf.chapters.projects10;

import java.util.Arrays;
/**
 * The shallowCopy method uses Arrays.copyOf to create a new array with the same length as the original array.
 * However, it only performs a shallow copy, meaning that the inner arrays are still referenced by both the original and the shallow copy.
 * The deepCopy method creates a new array with the same dimensions as the original array.
 * It then uses nested loops and Arrays.copyOf to copy each element from the original array to the new array. T
 * his ensures that a new set of inner arrays is created, resulting in a completely independent copy.
 * In the main method, we demonstrate the difference between shallow copy and deep copy.
 * After modifying an element in the shallow copy, we observe that the corresponding element in the original array is also modified.
 * However, modifying an element in the deep copy does not affect the original array.
 */
public class Project7ArrayCopyExample {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3}, {4, 5, 6}};

        // Shallow copy
        int[][] shallowCopy = shallowCopy(original);

        // Modify an element in the shallow copy
        shallowCopy[0][0] = 10;

        System.out.println("Original array after shallow copy modification:");
        printArray(original);

        System.out.println("Shallow copy array after modification:");
        printArray(shallowCopy);

        System.out.println();

        // Deep copy
        int[][] deepCopy = deepCopy(original);

        // Modify an element in the deep copy
        deepCopy[0][1] = 20;

        System.out.println("Original array after deep copy modification:");
        printArray(original);

        System.out.println("Deep copy array after modification:");
        printArray(deepCopy);
    }

    // Shallow copy method
    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // Deep copy method
    public static int[][] deepCopy(int[][] arr) {
        int[][] copy = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = Arrays.copyOf(arr[i], arr[i].length);
        }

        return copy;
    }

    // Utility method to print a two-dimensional array
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
