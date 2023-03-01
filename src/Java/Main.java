package Java;

import java.util.Arrays;

public class Main {

    /**
     * -=([{ Current unworkable exercises }])=-
     * NONE
     */

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(Java.ShuffleTheArray.shuffle(new int[]{1, 1, 2, 2}, 2)));
//        System.out.println("Correct Answer: 1, 2, 1, 2");
//        System.out.println(Arrays.toString(Java.ShuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
//        System.out.println("Correct Answer: 2, 3, 5, 4, 1, 7");
//        System.out.println(Arrays.toString(Java.ShuffleTheArray.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
//        System.out.println("Correct Answer: 1, 4, 2, 3, 3, 2, 4, 1");

//        System.out.println("Answer should be 2 -> " + Java.AddDigits.addDigits(38));
//        System.out.println("Answer should be 2 -> " + Java.AddDigits.addDigits(4736));
//        System.out.println("Answer should be 9 -> " + Java.AddDigits.addDigits(123456789));

//        System.out.println("Answer should be [0,1,2,4,5,3] : " + Arrays.toString(Java.BuildArrayFromPermutation.buildArray(new int[]{0, 2, 1, 5, 3, 4})));
//        System.out.println("Answer should be [4,5,0,1,2,3] : " + Arrays.toString(Java.BuildArrayFromPermutation.buildArray(new int[]{5, 0, 1, 2, 3, 4})));

//        System.out.println("Correct Answer -> 309.65000, 97.70000 Output ->" + Arrays.toString(Java.ConvertTheTemperature.convertTemperature(36.50)));
//        System.out.println("Correct Answer -> 395.26000, 251.79800 Output ->" + Arrays.toString(Java.ConvertTheTemperature.convertTemperature(122.11)));

//        System.out.println(Java.DefangingAnIPAddress.defangIPaddr("1.1.1.1"));
//        System.out.println(Java.DefangingAnIPAddress.defangIPaddr("255.100.50.0"));

//        System.out.println("Answer is 1 -> " + Java.FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));

//        System.out.println("Answer should be 4 -> " + Java.NumberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
//        System.out.println("Answer should be 6 -> " + Java.NumberOfGoodPairs.numIdenticalPairs(new int[]{1, 1, 1, 1}));
//        System.out.println("Answer should be 0 -> " + Java.NumberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3}));

//        System.out.println(Java.JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
//        System.out.println(Java.JewelsAndStones.numJewelsInStones("z", "ZZ"));

        System.out.println(Arrays.toString(RunningSumOf1DArray.runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(RunningSumOf1DArray.runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(RunningSumOf1DArray.runningSum(new int[]{3, 1, 2, 10, 1})));
    }
}
