package gr2.aueb.cf;

public class ArrayPopulateHardCoded {
    public static void main(String[] args) {
        int [] ages = new int[5];
        ages[0] = 19;
        ages[1] = 20;
        ages[2] = 23;
        ages[3] = 22;
        ages[4] = 30;

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
