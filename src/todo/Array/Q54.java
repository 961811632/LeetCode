package todo.Array;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        // 列
        int left = 0;
        int right = n - 1;
        // 行
        int top = 0;
        int bottom = m - 1;
        // 每圈走一个循环
        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            // 已经动了边界，需要再次判断
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

}
