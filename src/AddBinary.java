public class AddBinary {

    //        Given two binary strings a and b, return their sum as a binary string.

    public static String addBinary(String a, String b){

        // Parse binary numbers from String inputs
        int binA = Integer.parseInt(a);
        int binB = Integer.parseInt(b);

        // Variables will keep the sum of each binary input as a number
        int numA = 0;
        int numB = 0;

        // Multiplier multiplied by 2 everytime the loop iterates.  Simulates binary values 1, 2, 4, 8, 16 etc.
        int multiplier = 1;

        for(int i = a.length(); i > 0;i--){

            // Extracts the last number (0 or 1) and multiplies it to the multiplier everytime the loop runs
            // Adds the values to numA and numB respectively
            numA += (binA % 10) * multiplier;
            numB += (binB % 10) * multiplier;

            // Removes the last number from the binary integer every time the loop runs
            binA /= 10;
            binB /= 10;
            multiplier *= 2;
        }

        int numTotal = numA + numB;
        System.out.println("A = " + numA + " /// B = " + numB);
        System.out.println("Total = " + numTotal);

        for(int i = 0;i > 0;i++){
            
        }
        return "lul";
    }
}
