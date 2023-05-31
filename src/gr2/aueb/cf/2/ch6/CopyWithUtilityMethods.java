package gr2.aueb.cf;

import java.util.Arrays;

public class CopyWithUtilityMethods {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        int[] arr3;

        // System.arraycopy()
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        // Arrays class
        arr3 = Arrays.copyOf(arr, arr.length);
        arr3 = Arrays.copyOfRange(arr, 0, arr.length);
    }
}
