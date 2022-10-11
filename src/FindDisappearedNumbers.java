import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        System.out.println("Original" + Arrays.toString(nums));
        List<Integer> missingNumbers = new ArrayList<>();
        if (nums.length <= 1 || nums.length >= Math.pow(10, 5)) {
            return missingNumbers;
        }
        for (int num : nums) {
            if (!missingNumbers.contains(num)) {
                missingNumbers.add(num);
            }
        }
        System.out.println("Distinct" + missingNumbers);
        for (int i = 1; i <= nums.length; i++) {
            if (missingNumbers.contains(i)) {
                missingNumbers.remove((Integer) i);
            } else {
                missingNumbers.add(i);
            }
        }
        System.out.println("Missing" + missingNumbers);
        return missingNumbers;
    }
}
