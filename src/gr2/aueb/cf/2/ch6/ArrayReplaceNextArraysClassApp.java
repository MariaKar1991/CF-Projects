package gr2.aueb.cf;

import java.util.Arrays;

public class ArrayReplaceNextArraysClassApp {

    public static void main(String[] args) {
        int[] ages = {20, 22, 23, 24, 26};

        ages = Arrays.copyOf(ages, ages.length -1);

        ages = Arrays.copyOf(ages, ages.length + 1);

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
