package gr2.aueb.cf;

public class GradesDistributionApp {

    public static void main(String[] args) {
        int[] grades = {30, 9, 8, 14, 17, 22, 40, 55, 57, 59, 60, 61, 67, 68, 77, 72, 75, 80, 85, 93, 91, 100};
        int[] distribution = new int[10];

        for (int grade : grades) {
            if (grade == 100)
                distribution[9] += 1;
            else {
                distribution[grade / 10] += 1;
            }

            for (int i = 0; i < distribution.length; i++) {
                System.out.printf("%02d-%02d", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
                for (int j = 1; j <= distribution[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    }
