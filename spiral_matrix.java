import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // represent the boundaries of the matrix
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // traverse the matrix
        while (top <= bottom && left <= right) {
            // add top row to result
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // move top down

            // add right column to result
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // move right left

            // if top is less than or equal to bottom, add bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // move bottom up
            }

            // if left is less than or equal to right, add left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // move left right
            }
        }
        return result; // return the matrix in spiral order
    }
}
