import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();
        for (int num : nums) {
            if (!numberSet.add(num)) {
                return true;
            }
            numberSet.add(num);
        }
        return false;
    }
}
