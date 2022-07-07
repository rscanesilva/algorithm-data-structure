package algoritmos.hackerrank.hashmaps;

import java.util.HashMap;

public class TwoStrings {
    public static void main(String[] args) {
        System.out.println(twoStrings("Hello", "acd"));
    }

    public static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c1: s1.toCharArray()) {
            map.put(c1, 1);
        }
        for (char c2: s2.toCharArray()) {
            if (map.containsKey(c2)) {
                return "Yes";
            }
        }
        return "No";
    }
}
