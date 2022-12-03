public class SingleNumber {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    break;
                }
            }
            return nums[i];
        }
        return -1;
    }
}
