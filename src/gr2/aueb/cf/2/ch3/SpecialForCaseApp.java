package gr2.aueb.cf;

/**
 * Αέναο for loop
 */
public class SpecialForCaseApp {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) {
            System.out.println("forever");
            counter++;
            if (counter % 10 == 0) System.out.println();
              if (counter == 100) break;
        }
    }
}
