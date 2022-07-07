package algoritmos.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SalesByMatch {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
    public static void main(String[] args) throws IOException {
        int result = SalesByMatch.sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10,20));
        System.out.print(result);

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        int numberOfPairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.get(ar.get(i)) == null) {
                map.put(ar.get(i), ar.get(i));
            } else {
                numberOfPairs++;
                map.remove(ar.get(i));
            }
        }
        return numberOfPairs;
    }

}
