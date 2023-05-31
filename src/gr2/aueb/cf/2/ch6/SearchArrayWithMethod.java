package gr2.aueb.cf;

public class SearchArrayWithMethod {

    public static void main(String[] args) {
        int[] quantities = {100, 200, 300};
        int position = 0;
        int value = 100;

        position = getElementPosition(quantities, value);

        System.out.printf("Position: %d, Value: %d", position, quantities[position]);

    }
 /* αναζητει και επιστρεφει την θεση που βρισκετε
 στον πινακα το στοιχειο αλλιως αν δεν το βρει η ειναι null ο πινακας επιστρεφει -1
 */
    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
