package gr.aueb.cf.cf.applications;

public class CompareApp {
    public static void main(String[] args) {
        char a = 'α';
        char b = 'b';
        boolean greekIsGreater = false;


        System.out.println((int) a);
        System.out.println((int) b);

        if (a > b) greekIsGreater = true;

        System.out.println("Greek is greater: " + greekIsGreater);
    }
}
