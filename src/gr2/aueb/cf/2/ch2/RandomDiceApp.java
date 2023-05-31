package gr2.aueb.cf;

/**
 * Rolls two dice
 */
public class RandomDiceApp {
    public static void main(String[] args) {

        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die1; %d, Die2; %d ", die1, die2);

    }
}
