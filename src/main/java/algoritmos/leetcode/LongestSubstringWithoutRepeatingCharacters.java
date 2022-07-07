package algoritmos.leetcode;


import algoritmos.util.Utils;

public class LongestSubstringWithoutRepeatingCharacters {
    /*
        Given a string s, find the length of the longest substring without repeating characters.
        algoritmos.Example:
            Input: s = "pwwkew"
            Output: 3
            Explanation: The answer is "wke", with the length of 3.
            Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    //O(n)
    public static int godSolution(String s) {
        int result = 0;
        int[] cache = new int[128];

        for (int i = 0, j = 0; i < s.length(); i++) {
            j = Math.max(j, cache[s.charAt(i)]);
            cache[s.charAt(i)] = i + 1;
            result = Math.max(result, i - j + 1);
        }

        return result;
    }

    // O(n^2)
    public static int badSolution(String s) {
        String strWithoutDuplicates = "";
        int max = 0;
        for (int x = 0; x < s.length(); x++) {
            c:
            for (int c = x; c < s.length(); c++) {
                if (!strWithoutDuplicates.contains(s.charAt(c) + "")) {
                    strWithoutDuplicates += s.charAt(c);
                } else {
                    if (max < strWithoutDuplicates.length()){
                        max = strWithoutDuplicates.length();
                    }
                    strWithoutDuplicates = "";
                    break c;
                }
            }
        }
        return max;
    }
}


