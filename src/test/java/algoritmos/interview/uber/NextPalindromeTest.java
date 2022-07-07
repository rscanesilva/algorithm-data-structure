package algoritmos.interview.uber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextPalindromeTest {

    @Test
    public void getNextPalindromeTest(){
        assertEquals( 11, NextPalindrome.getNextPalindrome(3));
        assertEquals( 11, NextPalindrome.getNextPalindrome(10));
        assertEquals( 22, NextPalindrome.getNextPalindrome(12));
        assertEquals( 33, NextPalindrome.getNextPalindrome(22));
        assertEquals( 202, NextPalindrome.getNextPalindrome(101));
        assertEquals( 1001, NextPalindrome.getNextPalindrome(1000));
        assertEquals( 1221, NextPalindrome.getNextPalindrome(1220));
        assertEquals( 1331, NextPalindrome.getNextPalindrome(1221));
        assertEquals( 12321, NextPalindrome.getNextPalindrome(12320));
        assertEquals( 13331, NextPalindrome.getNextPalindrome(12321));
        assertEquals( 124421, NextPalindrome.getNextPalindrome(123321));
    }
}
