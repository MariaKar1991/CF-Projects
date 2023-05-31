package gr2.aueb.cf;

public class GetMissing {

    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 2};
        int missing = getMissing(arr);
        System.out.println("The missing element is: " + missing);
    }

    public static int getMissing(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return sum - arrSum;
    }
}

