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
            System.out.println("outer loop");
            List<Integer> previousRow = rows.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            int iterations = previousRow.size();
            for(int j = 0;j <= iterations;j++){
                System.out.println("inner loop");
                currentRow.add(i + j);
            }
            currentRow.add(i);
            rows.add(currentRow);
        }
        return rows;
    }
}
