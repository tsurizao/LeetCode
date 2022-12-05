public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        if (nums.length % 2 == 0) {
            for (int i = 0; i < nums.length / 2; i++) {
                int k = nums.length / 2;
                for (int j = 0; j < nums.length / 2; j++) {
                    if(i == k){
                        return true;
                    }
                    if (i == j) {
                        continue;
                    }
                    if (nums[i] == nums[j] || nums[k] == nums[k + i]) {
                        return true;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums.length / 2; i++) {
                int k = nums.length / 2 + 1;
                for (int j = 0; j < nums.length / 2; j++) {
                    System.out.println("i = " + nums[i] + " j = " + nums[j] + " halfIndex = " + nums[k]);
                    k++;
                    if (i == j) {
                        if(nums[i] == nums[k]){
                            return true;
                        } else {
                            continue;
                        }
                    }
                    if (nums[i] == nums[j] || nums[i] == nums[k]) {
                        return true;
                    }
                    k++;
                }
            }
        }
        return false;
    }
}
