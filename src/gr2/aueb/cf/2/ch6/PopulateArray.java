package gr2.aueb.cf;

/**
 * Δηλωση και αρχικοποιηση πινακα και εισαγωγη στοιχειων
 * populate
 */
public class PopulateArray {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση πινακα με length
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        //System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // enhanced for (πιο ασφαλης τροπος απο απλη for)
        for (int item : arr) {
            System.out.print(item + " ");
        }

        // Unsized initialization
        int[] arr2 = {1, 5, 8, 9, 12};

        // Array Initializer (πιο ευελικτος τροπος απο unsized initialization)
        int[] arr3 = new int[] {4, 6, 9, 10};
    }
}
