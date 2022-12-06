import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!numberSet.add(nums[i])){
                return true;
            }
            numberSet.add(nums[i]);
        }
        return false;
    }
}
