package algoritmos.leetcode;

import java.util.HashMap;

public class FirstNotRepeatCharacter {
    /*
        'ababcd' -> return c
        ' ' -> invalid (not null our empty)
        'abcabc' -> return '_'
        'abcc123' -> invalid (not numbers)
     */
    public static void main(String[] args) {
        char result = FirstNotRepeatCharacter.solution2("abagbcdcdff");
        System.out.print(result);
    }

    public static char solution (String input) {
        int[] cache = new int[300];
        char firstNotRepeat = '_';

        for (var x=0; x < input.length(); x++) {
            cache[input.charAt(x)] += 1;
        }

        for (var x=0; x < input.length(); x++) {
            if (cache[input.charAt(x)] == 1) {
                firstNotRepeat = input.charAt(x);
                break;
            }
        }
        return firstNotRepeat;
    }

    public static char solution2 (String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        char firstNotRepeat = '_';

        for (var x=0; x < input.length(); x++) {
            var count = 1;
            if (map.get(input.charAt(x))!= null)
                count += map.get(input.charAt(x));
            map.put(input.charAt(x), count);
        }

        for (var x=0; x < input.length(); x++) {
            if (map.get(input.charAt(x)) == 1) {
                firstNotRepeat = input.charAt(x);
                break;
            }
        }
        return firstNotRepeat;
    }
}
