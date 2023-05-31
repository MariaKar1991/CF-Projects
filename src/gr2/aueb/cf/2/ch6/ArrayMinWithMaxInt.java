package gr2.aueb.cf;

public class ArrayMinWithMaxInt {

    public static void main(String[] args) {
        int[] arr = {6, 90, 4, 17};

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value: %d, Min Position: %d", minValue, minPosition + 1);
    }
}
