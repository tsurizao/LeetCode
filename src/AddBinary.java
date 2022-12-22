import java.math.BigInteger;

public class AddBinary {

    //        Given two binary strings a and b, return their sum as a binary string.

    public static String addBinary(String a, String b) {

        // BigIntegers will keep the sum of each binary input as a number
        BigInteger numA = BigInteger.valueOf(0);
        BigInteger numB = BigInteger.valueOf(0);

        // Multiplier multiplied by 2 everytime the loop iterates.  Simulates binary values 1, 2, 4, 8, 16 etc.
        BigInteger multiplier = BigInteger.valueOf(1);

        // length will equal the higher of the two strings
        int length = Math.max(a.length(), b.length());

        // Loop to convert binary to number, BigInteger for extremely large numbers
        for (int i = length; i > 0; i--) {
            // Extracts the last character ('0' or '1'), converts to int and
            // multiplies with the multiplier variable.  Replaces old String with new
            // substring with the final char removed.  Then adds the values to numA
            // and numB respectively.  Multiplier keeps track of binary place
            if (a.length() > 0) {
                numA = numA.add(multiplier.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(a.charAt(a.length() - 1))))));
                a = a.substring(0, a.length() - 1);
            }
            if (b.length() > 0) {
                numB = numB.add(multiplier.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(b.charAt(b.length() - 1))))));
                b = b.substring(0, b.length() - 1);
            }
            multiplier = multiplier.multiply(BigInteger.valueOf(2));
        }

        // Variable that holds the sum of both converted binary numbers
        BigInteger numTotal = numA.add(numB);

        // Printing to check that everything works so far (Works as intended thus far)
        System.out.println("A = " + numA);
        System.out.println("B = " + numB);
        System.out.println("T = " + numTotal);
        System.out.println("M = " + multiplier);

        // Place to store sum as a binary String
        StringBuilder binaryTotal = new StringBuilder();

        // Loop to convert number total into a binary String
        // Divides previous multiplier value by 2 every iteration, loop condition
        while (multiplier.compareTo(BigInteger.ZERO) >= 1) {

            System.out.println(numTotal);
            System.out.println(multiplier);
            // If the numTotal minus multiplier is not negative it adds "1",
            // otherwise adds a "0".  The loop then proceeds to add a "1" or "0"
            // as long as the multiplier is not equal to 0.
            if (numTotal.subtract(multiplier).compareTo(BigInteger.ZERO) >= 0) {
                binaryTotal.append("1");
                numTotal = numTotal.subtract(multiplier);
            } else {
                binaryTotal.append("0");
            }
            multiplier = multiplier.divide(BigInteger.valueOf(2));
        }

        // Removes leading 0's if any
        if (binaryTotal.charAt(0) == '0') {
            binaryTotal.deleteCharAt(0);
        }
        return binaryTotal.toString();
    }
}
