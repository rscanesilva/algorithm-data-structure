package algoritmos.hackerrank.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2DTest {
    List<List<Integer>> caseOne = new ArrayList();
    List<List<Integer>> caseTwo =  new ArrayList();;

    @BeforeEach
    private void init() {
        caseOne.add(Arrays.asList(-1, -1, 0, -9, -2, -2));
        caseOne.add(Arrays.asList(-2, -1, -6, -8, -2, -5));
        caseOne.add(Arrays.asList(-1, -1, -1, -2, -3, -4));
        caseOne.add(Arrays.asList(-1, -9, -2, -4, -4, -5));
        caseOne.add(Arrays.asList(-7, -3, -3, -2, -9, -9));
        caseOne.add(Arrays.asList(-1, -3, -1, -2, -4, -5));

        caseTwo.add(Arrays.asList(1, 1, 0, 9, 2, 2));
        caseTwo.add(Arrays.asList(2, 1, 6, 8, 2, 5));
        caseTwo.add(Arrays.asList(1, 1, 1, 2, 3, 4));
        caseTwo.add(Arrays.asList(1, 9, 2, 4, 4, 5));
        caseTwo.add(Arrays.asList(7, 3, 3, 2, 9, 9));
        caseTwo.add(Arrays.asList(1, 3, 1, 2, 4, 5));
    }
    @Test
    public void hourglassSumTest() {
        Assertions.assertEquals(-6, Array2D.hourglassSum(caseOne));
        Assertions.assertEquals(33, Array2D.hourglassSum(caseTwo));
    }
}