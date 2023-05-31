package gr2.aueb.cf;

public class ArrayUpdateApp {

    public static void main(String[] args) {
        final int KEY = 10;
        boolean keyIsFound = false;
        int[] arr = {1, 5, 8, 9, 10, 15};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == KEY) {
                arr[i] = KEY * 2;
            }
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
