import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //TODO still working on a solution
        System.out.println("Numbers Found: " + Arrays.toString(nums));
        Arrays.sort(nums);
        nums = Arrays.stream(nums).distinct().toArray();
        System.out.println("Array" + Arrays.toString(nums));
        List<Integer> missingNumbers = new ArrayList<>();

        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                System.out.println(nums[i + 1] + " - " + nums[i] + " = " + (nums[i + 1] - nums[i]));
                missingNumbers.add(i + 2);
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(missingNumbers);
        return missingNumbers;
    }
}
