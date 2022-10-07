public class MoveZeroes {

    //    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.
    public static int[] moveZeroes(int[] nums) {
        int reverseIndex = nums.length - 1;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 0) {
            if(count == nums.length - 1){
                break;
            }
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[reverseIndex - i] = 0;
                count++;
            }
            if (nums[i] != 0) {
                i++;
            }
            if (i == reverseIndex - 1) {
                break;
            }
        }
        return nums;
    }
}
