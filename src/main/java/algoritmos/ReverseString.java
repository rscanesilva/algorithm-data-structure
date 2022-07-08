package algoritmos;

import java.nio.charset.StandardCharsets;

public class ReverseString {
    // O(n/2) -> (n)
    public static String reverse(String text) {
        byte[] val = text.getBytes(StandardCharsets.UTF_8);
        int count = text.length();
        int numberOfIterations = 0;
        int n = count - 1;
        for (int j = (n-1) >> 1; j >= 0; j--) {
            int k = n - j;
            byte cj = val[j];
            val[j] = val[k];
            val[k] = cj;
            numberOfIterations++;
        }

        return new String(val, StandardCharsets.UTF_8);
    }
}
