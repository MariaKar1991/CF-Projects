package gr.aueb.cf.cf.applications;

public class ForBreakApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) break;
        }

        System.out.println();
        System.out.println("for loop stopped...");
    }
}
