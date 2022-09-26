import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] consecNums = {1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1};
//        System.out.println("Max Consecutive 1's: " + MaxConsecutiveOnes.MaxConsecutiveOnes(consecNums));
//
//        int[] evenDigitNums = {22, 321, 1, 3456, 123456, 12345, 32, 12345678};
//        System.out.println("Numbers with even number of digits: " + EvenNumberDigits.evenNumberDigits(evenDigitNums));
//
//        int[] sortSquaredNums = {-7,-3,2,3,11};
//        System.out.println("Array Squared and sorted: " + Arrays.toString(SquaredSortedArray.squareAndSort(sortSquaredNums)));

        int[] duplicateZeroesTest1 = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] duplicateZeroesTest2 = {1, 2, 3};
        System.out.println("Original: " + Arrays.toString(duplicateZeroesTest1));
        DuplicateZeroes.duplicateZeroes(duplicateZeroesTest1);
        DuplicateZeroes.duplicateZeroes(duplicateZeroesTest2);
    }
}
