import java.util.Arrays;

public class SortArrayByParity {
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
