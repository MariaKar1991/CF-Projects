package gr2.aueb.cf;

/**
 *  Υπολογιζει το a^n αναδρομικα
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        float a = 0;
        float n = 0;

        System.out.println(power(a, n));

    }

    /**
     * recursive a^n
     *
     * @param a the base
     * @param n the power
     * @return  the power of a
     */
    public static float power(float a, float n) {
      if (n < 0) {
          return 1 / a * power(a, -n);
      }
      if (n == 0) return 1;

      return a * power(a, n-1);

    }
}
