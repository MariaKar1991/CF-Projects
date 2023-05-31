package gr2.aueb.cf;

public class MinMaxApp {

    public static void main(String[] args) {
        int[] grades = new int[] {7, 6, 3, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = grades[0];
        int maxValue = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < minValue) {
                minPosition = i;
                minValue = grades[i];
            }

            if (grades[i] > maxValue) {
                maxPosition = i;
                maxValue = grades[i];
            }
            System.out.printf("MinValue: %d, MinPosition: %d\n", minValue, minPosition + 1);
            System.out.printf("MaxValue: %d, MaxPosition: %d", maxValue, maxPosition + 1);
        }
    }
}
