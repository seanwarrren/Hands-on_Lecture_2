import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class SpiralMatrixTest {

    @Test
    public void testSpiralOrder() {
        spiral_matrix sm = new spiral_matrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> expected = Arrays.asList(1,2,3,6,9,8,7,4,5);
        assertEquals(expected, sm.spiralMatrix(matrix));
    }
}