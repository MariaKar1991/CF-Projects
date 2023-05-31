package gr2.aueb.cf;

public class ArrayReplaceNextApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length -2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}
