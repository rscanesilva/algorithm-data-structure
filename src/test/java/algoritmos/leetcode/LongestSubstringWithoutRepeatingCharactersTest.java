package algoritmos.leetcode;

import algoritmos.util.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    public static final int LENGTH = 10;

    @Test
    public void godSolutionTest() {
        long start = System.currentTimeMillis();
        int result = LongestSubstringWithoutRepeatingCharacters.godSolution(Utils.getLoremIpsum(LENGTH));
        System.out.printf("godSolution O(n) executado em %s ms%n", System.currentTimeMillis()-start);
        Assertions.assertEquals(14, result);
    }

    @Test
    public void badSolutionTest() {
        long start = System.currentTimeMillis();
        int result = LongestSubstringWithoutRepeatingCharacters.badSolution(Utils.getLoremIpsum(LENGTH));
        System.out.printf("badSolution O(n) executado em %s ms%n", System.currentTimeMillis()-start);
        Assertions.assertEquals(14, result);
    }
}
