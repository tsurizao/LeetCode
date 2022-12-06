public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j){
                    break;
                } else {
                    if(nums[i] == nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
