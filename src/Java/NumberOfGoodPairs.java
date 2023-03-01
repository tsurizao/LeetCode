package Java;

public class NumberOfGoodPairs {

    // Given an array of integers nums, return the number of good pairs.
    //
    //A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i < j){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}