public class AddBinary {

    //        Given two binary strings a and b, return their sum as a binary string.

    public static String addBinary(String a, String b){

        int binA = Integer.parseInt(a);
        int binB = Integer.parseInt(b);
        int numA = 0;
        int numB = 0;
        int multiplier = 1;
        for(int i = a.length(); i > 0;i--){
            numA += (binA % 10) * multiplier;
            numB += (binB % 10) * multiplier;
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
