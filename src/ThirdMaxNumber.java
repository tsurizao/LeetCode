import java.util.Arrays;

public class ThirdMaxNumber {

    //    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        int number = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums.length < 3) {
                return nums[nums.length - 1];
            }
            if (k == 3) {
                break;
            }
            if (nums[i] < number) {
                k++;
                number = nums[i];
            }
        }
        return number;
    }
}
