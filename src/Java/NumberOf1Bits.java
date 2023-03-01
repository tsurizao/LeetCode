package Java;

public class NumberOf1Bits {

    /**
     * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
     * <p>
     * Note:
     * <p>
     * Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
     * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
     */

    public static int hammingWeight(int n) {
        System.out.println(n);

        // bitCount(int i) is a built-in Java method found at ...
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#bitCount-int-
        return Integer.bitCount(n);
    }
}
