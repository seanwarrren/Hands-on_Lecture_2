import java.util.Arrays;

public class test_cases {
    public static void main(String[] args) {
        pascal_triangle pt = new pascal_triangle();
        spiral_matrix sm = new spiral_matrix();

        // test cases for pascal triangle
        System.out.println("Pascal's Triangle Test Cases:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Num Rows = " + i + ": " + pt.pascalTriangle(i));
        }

        // test cases for spiral matrix
        int[][] one = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] two = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] three = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] four = new int[][] {{1}};
        int[][] five = new int[][] {{1, 2, 3}};
        int[][] six = new int[][] {{1}, {2}, {3}};
        int[][] seven = new int[][] {{}};

        System.out.println("\nSpiral Matrix Test Cases:");
        System.out.println("Input: " + Arrays.deepToString(one) + "\nOutput: " + sm.spiralMatrix(one));
        System.out.println("Input: " + Arrays.deepToString(two) + "\nOutput: " + sm.spiralMatrix(two));
        System.out.println("Input: " + Arrays.deepToString(three) + "\nOutput: " + sm.spiralMatrix(three));
        System.out.println("Input: " + Arrays.deepToString(four) + "\nOutput: " + sm.spiralMatrix(four));
        System.out.println("Input: " + Arrays.deepToString(five) + "\nOutput: " + sm.spiralMatrix(five));
        System.out.println("Input: " + Arrays.deepToString(six) + "\nOutput: " + sm.spiralMatrix(six));
        System.out.println("Input: " + Arrays.deepToString(seven) + "\nOutput: " + sm.spiralMatrix(seven));
    }
}
