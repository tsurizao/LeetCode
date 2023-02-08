public class ConcatenationOfArray {
//    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//    Specifically, ans is the concatenation of two nums arrays.
//
//    Return the array ans.

    public static int[] getConcatenation(int[] nums){
        int[] concatNums = new int[nums.length * 2];
        int j = nums.length;
        for(int i = 0;i < nums.length;i++){
            concatNums[i] = nums[i];
            concatNums[j] = nums[i];
            j++;
        }
        return concatNums;
    }
}
