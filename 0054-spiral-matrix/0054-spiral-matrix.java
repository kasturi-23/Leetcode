import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i;
        int row_start = 0, col_start = 0;
        int row_end = matrix.length - 1;
        int col_end = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();

        while (row_start <= row_end && col_start <= col_end) {
        
            for (i = col_start; i <= col_end; i++) {
                result.add(matrix[row_start][i]);
            }
            row_start++;

       
            for (i = row_start; i <= row_end; i++) {
                result.add(matrix[i][col_end]);
            }
            col_end--;

          
            if (row_start <= row_end) {
                for (i = col_end; i >= col_start; i--) {
                    result.add(matrix[row_end][i]);
                }
                row_end--;
            }

        
            if (col_start <= col_end) {
                for (i = row_end; i >= row_start; i--) {
                    result.add(matrix[i][col_start]);
                }
                col_start++;
            }
        }

        return result;
    }
}
