import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

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
