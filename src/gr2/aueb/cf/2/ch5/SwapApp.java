package gr2.aueb.cf;

public class SwapApp {

    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    swap(a, b);

        System.out.println("a = " + a + " b = " + b);
    }

    /**
     * swaps a, b, s = a -> b, b -> a.
     * @param a the first value
     * @param b the second value
     */
    public static void swap (int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
