package algoritmos.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversStringTest {

    @Test
    public void reverseTest() {
        Assertions.assertEquals("dbca", ReverseString.reverse("abcd"));
    }
}
