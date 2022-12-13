import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        if (numRows == 0) {
            return rows;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        rows.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = rows.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j = 1;j < i;j++){
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            rows.add(currentRow);
        }
        return rows;
    }
}
