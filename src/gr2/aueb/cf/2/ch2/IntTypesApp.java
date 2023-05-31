package gr2.aueb.cf;

/**
 * Εμφανίζει τους τυπους δεδομενων
 * ακεραιων,το μεγεθος,και τα
 * MIN - MAX values
 */
public class IntTypesApp {

    public static void main(String[] args) {
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Integer.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Byte.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Short.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Long.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
}
