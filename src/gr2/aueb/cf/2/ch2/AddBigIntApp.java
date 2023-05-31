package gr2.aueb.cf;

import java.math.BigInteger;

/**
 * Demonstrates BigInteger class.
 */
public class AddBigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("214748364788888");
        BigInteger bigNum2 = new BigInteger("214748364788889");
        BigInteger result = new BigInteger("0");


        result = bigNum.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
