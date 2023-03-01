package Java;

public class CountOddNumbersInAnIntervalRange {
    public static int countOdds(int low, int high) {
        if (high - low == 0) {
            if (high % 2 != 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if ((high - low + 1) / 2 == 0) {
            return (high - low + 1) / 2;
        }
        if (low % 2 != 0) {
            return (high - low + 2) / 2;
        }
        return (high - low + 1) / 2;
    }
}
