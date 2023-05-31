package gr2.aueb.cf;

public class OverLoadingApp {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1L, 2));
        System.out.println(add(1L, 2L));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(long a, int b) {
        return a + b;
    }
    public static long add(long a, long b) {
        return a + b;
    }

}
