package gr.aueb.cf.chapters.ch1;

import java.util.Scanner;

/**
 * Μετατρεπει θερμοκρασιες Fahrenheit
 * σε Celsius.
 */
public class CelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

        System.out.println("Please provide temp in fahrenheit");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit -32) / 9;

        System.out.printf("%d\u00B0F = %d\u00B0C", fahrenheit, celsius);
    }
}
