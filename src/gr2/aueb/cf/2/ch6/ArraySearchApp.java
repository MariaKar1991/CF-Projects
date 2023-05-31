package gr2.aueb.cf;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int KEY = 10;
        boolean keyIsFound = false;
        int[] arr = {1, 5, 8, 9, 10, 15};

        for (int item : arr) {
            if (item == KEY) {
               keyIsFound = true;
               break;
            }
        }
        // for (int i = 0; i < arr.length; i++) {  -- not enhanced for
        // if (KEY == arr[i]) {
        //    keyIsFound = true;
        //    break;
        //}

        if (keyIsFound) {
            System.out.println("Key was found");
        } else {
            System.out.println("Key was not found");
        }
    }
}
