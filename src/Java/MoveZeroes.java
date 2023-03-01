package Java;

public class MoveZeroes {

    //    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.

    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[index] == 0) {
                for (int j = index; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            } else {
                index++;
            }
        }
        return nums;
    }
}
