package gr2.aueb.cf;

/**
 *  updates the elements of an array.
 */
public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] grades = {4, 2, 8, 9, 5};

        upscaleByOne(grades);
        printArray(grades);

    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
