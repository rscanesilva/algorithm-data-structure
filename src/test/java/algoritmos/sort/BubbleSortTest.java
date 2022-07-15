package algoritmos.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void ordernarTest () {
        int[] array = {1,4,3,6,2,5,7,9,8,0};
        BubbleSort.sort(array, SortingType.ASCENDING);
        Assertions.assertEquals(0, array[0]);
        Assertions.assertEquals(9, array[9]);
        BubbleSort.sort(array, SortingType.DESCENDING);
        Assertions.assertEquals(9, array[0]);
        Assertions.assertEquals(0, array[9]);
    }
}
