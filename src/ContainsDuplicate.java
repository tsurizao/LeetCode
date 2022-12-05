public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        if (nums.length % 2 == 0) {
            int halfIndex = nums.length / 2;
            for (int i = 0; i < nums.length / 2; i++) {
                for (int j = 0; j < nums.length / 2; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (nums[i] == nums[j] || nums[i] == nums[halfIndex]) {
                        return true;
                    }
                }
                halfIndex++;
            }
        } else {
            int halfIndex = nums.length / 2;
            for (int i = 0; i < nums.length / 2; i++) {
                for (int j = 0; j < nums.length / 2; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (nums[i] == nums[j] || nums[i] == nums[halfIndex]) {
                        return true;
                    }
                    halfIndex++;
                }
            }
        }
        return false;
    }
}
