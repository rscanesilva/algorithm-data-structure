package algoritmos.hackerrank.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LeftRotationTest {
    int[] smallArary;
    int[] expectArray;
    int[] largeArray;
    final int LARGE = 1000000;

    @BeforeEach
    public void init() {
        smallArary = new int[]{1,2,3,4,5};
        expectArray = new int[]{4,5,1,2,3};

        largeArray = new int[LARGE];
        for (int i=0; i<1000000; i++) {
            largeArray[i] = i;
        }
    }

    @Test
    public void functionalTest() {
        int[] rotedArray = LeftRotation.rotLeft(smallArary, 3);
        for(int i=0; i<smallArary.length; i++)
            Assertions.assertEquals(expectArray[i], rotedArray[i]);
    }

    @Test
    public void performanceTest() {
        Assertions.assertTimeout(Duration.ofMillis(30), () -> LeftRotation.rotLeft(largeArray, 60000));
    }
}
