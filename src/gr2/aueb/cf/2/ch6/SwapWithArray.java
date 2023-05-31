package gr2.aueb.cf;

public class SwapWithArray {
    public static void main(String[] args) {
        int[] arr = {5, 12};
        printArray(arr);
        System.out.println();
        swap(arr);
        printArray(arr);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

    }
}
