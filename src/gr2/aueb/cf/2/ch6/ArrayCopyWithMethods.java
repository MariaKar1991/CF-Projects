package gr2.aueb.cf;

import java.util.Arrays;

public class ArrayCopyWithMethods {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrayCopy = new int[5];


        System.arraycopy(arr, 0, arrayCopy, 0, arr.length);
        printArray(arrayCopy);


        arrayCopy = Arrays.copyOf(arr, arr.length);
        printArray(arrayCopy);

        arrayCopy = Arrays.copyOfRange(arr, 0,arr.length);
        printArray(arrayCopy);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
