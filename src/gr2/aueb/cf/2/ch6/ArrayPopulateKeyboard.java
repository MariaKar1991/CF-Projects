package gr2.aueb.cf;

import java.util.Scanner;

public class ArrayPopulateKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Δώστε αριθμό για τη θέση: " + (i + 1));

            ages[i] = sc.nextInt();

        }

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");

            }
        }
    }

