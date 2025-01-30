import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static List<Integer> spiralMatrix(int[][] matrix) {
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

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] matrix3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix4 = {{1}};

        System.out.println(spiralMatrix(matrix1));
        System.out.println(spiralMatrix(matrix2));
        System.out.println(spiralMatrix(matrix3));
        System.out.println(spiralMatrix(matrix4));
    }
}
