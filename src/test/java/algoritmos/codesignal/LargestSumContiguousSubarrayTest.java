package algoritmos.codesignal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestSumContiguousSubarrayTest {

    @Test
    public void solutionTest () {
        int[] array = { -1, -2, -3, 4, 5, 6, -8, -9 };
        int result = LargestSumContiguousSubarray.solution(array);
        Assertions.assertEquals(15, result);

        array = new int[]{ -1, 2, 3, 4, -10 };
        result = LargestSumContiguousSubarray.solution2(array);
        Assertions.assertEquals(9, result);
    }
}