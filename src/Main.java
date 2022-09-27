import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] consecNums = {1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1};
//        System.out.println("Max Consecutive 1's: " + MaxConsecutiveOnes.MaxConsecutiveOnes(consecNums));

//        int[] evenDigitNums = {22, 321, 1, 3456, 123456, 12345, 32, 12345678};
//        System.out.println("Numbers with even number of digits: " + EvenNumberDigits.evenNumberDigits(evenDigitNums));

//        int[] sortSquaredNums = {-7,-3,2,3,11};
//        System.out.println("Array Squared and sorted: " + Arrays.toString(SquaredSortedArray.squareAndSort(sortSquaredNums)));

//        int[] duplicateZeroesTest1 = {1, 0, 2, 3, 0, 4, 5, 0};
//        DuplicateZeroes.duplicateZeroes(duplicateZeroesTest1);

//        int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2, 5, 6}; int n = 3;
//        MergeSortedArrays.merge(nums1, m, nums2, n);

//        int[] nums1 = {4, 5, 6, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {1, 2, 3};
//        int n = 3;
//        MergeSortedArrays.merge(nums1, m, nums2, n);

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement.removeElement(nums, val);
//        Output: 5, nums = [0, 1, 4, 0, 3, _, _, _]
//        Explanation:
//        Your function should return k = 5,with the first five elements of nums containing 0, 0, 1, 3, and 4.
//        Note that the five elements can be returned in any order.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
    }
}
