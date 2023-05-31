package gr2.aueb.cf;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8};
        int[] rotated = doCircularRightShiftBy(arr, 0);


        for (int item : arr) {
            System.out.print(item + " ");
        }

    }

    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

}
