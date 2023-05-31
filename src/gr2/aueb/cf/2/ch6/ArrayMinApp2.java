package gr2.aueb.cf;

public class ArrayMinApp2 {

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 8, 9, 8, 2, 11};
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min Value: %d, Min Position: %d", minValue, minPosition + 1);
    }
}
