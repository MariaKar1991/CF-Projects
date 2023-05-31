package gr2.aueb.cf;

/**
 * char output
 */

public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = 's';
        char ch2 = '8';

        System.out.println("char: " + ch1 + ", ordinal: " + (int) ch1);
        System.out.println("char: " + ch2 + ", ordinal: " + (int) ch2);

        System.out.printf("char: %c, ordinal: %d\n", ch1, (int) ch1);
        System.out.printf("char: %c, ordinal: %d\n", ch2, (int) ch2);
    }
}
