package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

//    Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //TODO still working on a solution
        System.out.println("Numbers Found: " + Arrays.toString(nums));
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }

        System.out.println("Sorted " + Arrays.toString(nums));
        int k = 0;
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[k] != i) {
                missingNumbers.add(i);
            } else {
                k++;
            }
        }

        System.out.println("Missing Numbers" + missingNumbers);
        return missingNumbers;
    }
}
