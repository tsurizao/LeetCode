public class CountOddNumbersInAnIntervalRange {
    public static int countOdds(int low, int high) {
        if ((high - low + 1) % 2 == 0) {
            return (high - low + 1) / 2;
        } else {
            return (high - low) / 2;
        }
    }
}
