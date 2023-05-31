package gr2.aueb.cf;

public class GradesPercentageApp {

    public static void main(String[] args) {
        int[] grades = new int[] {1, 2, 2, 4, 5, 5, 0, 2, 0, 4, 5, 2, 1, 1};
        int[] counts = new int[6];

        for (int grade : grades) {
            counts[grade]++;
        }

        for (int i =0; i < counts.length; i++) {
            System.out.printf("Grade %d: %.2f%%\n", i, (double) counts[i] / grades.length);
        }
    }
}
