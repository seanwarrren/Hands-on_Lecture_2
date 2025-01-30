import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
    public List<List<Integer>> pascalTriangle(int numRows) {
        // initialize the triangle list to store the result
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            // initialize a list to store the elements of the current row
            List<Integer> row = new ArrayList<>();

            // loop to fill elements of each row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { // first and last element of every row is 1
                    row.add(1);
                } else { // intermediate elements are the sum of the elements above
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            // add each row to the triangle
            triangle.add(row);
        }
        return triangle;
    }
}
