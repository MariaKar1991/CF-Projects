package gr2.aueb.cf;

public class ProjectCh5 {

    public static void main(String[] args) {

    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsHVAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsHVDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
            System.out.println();
        }
    }
}