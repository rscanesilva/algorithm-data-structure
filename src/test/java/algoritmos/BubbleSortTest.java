package algoritmos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void ordernarTest () {
        int[] array = {1,4,3,6,2,5,7,9,8,0};
        BubbleSort.ordernar(array, BubbleSort.TipoOrdenacao.CRESCENTE);
        Assertions.assertEquals(0, array[0]);
        Assertions.assertEquals(9, array[9]);
        BubbleSort.ordernar(array, BubbleSort.TipoOrdenacao.DECRESCENTE);
        Assertions.assertEquals(9, array[0]);
        Assertions.assertEquals(0, array[9]);
    }
}
