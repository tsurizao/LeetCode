package Java;

import java.util.Arrays;

public class SortArrayByParity {

//    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//    Return any array that satisfies this condition.

    public static int[] sortByParity(int[] nums) {
        int temp;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[k] % 2 != 0) {
                temp = nums[k];
                for (int j = k; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = temp;
            } else {
                k++;
            }
        }
        return nums;
    }
}
