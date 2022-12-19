public class AddBinary {

    //        Given two binary strings a and b, return their sum as a binary string.

    public static String addBinary(String a, String b) {

        // Parse binary numbers from String inputs
        int binA = Integer.parseInt(a);
        int binB = Integer.parseInt(b);

        // Variables will keep the sum of each binary input as a number
        int numA = 0;
        int numB = 0;

        // Multiplier multiplied by 2 everytime the loop iterates.  Simulates binary values 1, 2, 4, 8, 16 etc.
        int multiplier = 1;

        // Loop to convert binary integers to number integers
        for (int i = a.length(); i > 0; i--) {

            // Extracts the last number (0 or 1) and multiplies it to the multiplier everytime the loop runs
            // Adds the values to numA and numB respectively
            numA += (binA % 10) * multiplier;
            numB += (binB % 10) * multiplier;

            // Removes the last number from the binary integer every time the loop runs
            binA /= 10;
            binB /= 10;
            multiplier *= 2;
        }

        // Variable that holds the sum of both converted binary numbers
        int numTotal = numA + numB;

        // Printing to check that everything works so far (Works as intended thus far)
        System.out.println("A = " + numA + " /// B = " + numB);
        System.out.println("Total = " + numTotal);
        System.out.println("Multiplier = " + multiplier);

        // Place to store sum as a binary String
        String binaryTotal = "";


        // Loop to convert number total into a binary String
        for (int i = 0; multiplier > 0; i++) {

            // If the numTotal minus multiplier is not negative it adds "1",
            // otherwise adds a "0".  The loop then proceeds to add a "1" or "0"
            // as long as the multiplier is not equal to 0.
            if (numTotal - multiplier >= 0) {
                binaryTotal += "1";
                numTotal -= multiplier;
            } else {
                binaryTotal += "0";
            }

            // Divides previous multiplier value by 2 every iteration, loop condition
            multiplier /= 2;
        }
        return binaryTotal;
    }
}
