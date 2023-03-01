package Java;

public class RunningSumOf1DArray {
    // Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    //
    //Return the running sum of nums.

    public static int[] runningSum(int[] nums){
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[i] + sum;
            sum+=temp;
        }
        return nums;
    }
}
