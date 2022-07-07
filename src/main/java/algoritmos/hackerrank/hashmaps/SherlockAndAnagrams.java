package algoritmos.hackerrank.hashmaps;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class SherlockAndAnagrams {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static void main(String[] args) throws IOException {
        int result = SherlockAndAnagrams.sherlockAndAnagrams("kkkk");
        System.out.println(result);
    }

    public static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap<>();

        for (var i=0; i<s.length(); i++) {
            putMap(map, String.valueOf(s.charAt(i)));
            for (int y = s.length(); i <y-1; y--) {
                char[] value = s.substring(i, y).toCharArray();
                Arrays.sort(value);
                putMap(map, String.valueOf(value));
            }
        }
        Optional<Integer> sum = map.values().stream().map(k -> (k * (k - 1)) / 2).reduce(Integer::sum);
        return sum.orElse(-1);

    }

    public static void putMap(HashMap<String, Integer> map, String key) {
        if (map.containsKey(key)){
            map.put(key, map.get(key)+1);
        } else {
            map.put(key, 1);
        }
    }
}
