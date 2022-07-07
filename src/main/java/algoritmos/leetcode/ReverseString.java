package algoritmos.leetcode;

import algoritmos.util.Utils;

import java.nio.charset.StandardCharsets;

public class ReverseString {

    public static final int LENGTH = 10;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(String.format("godSolution: executed in %s ", System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        badSolution(Utils.getLoremIpsum(LENGTH));
        System.out.println(String.format("badSolution: executed in %s ", System.currentTimeMillis() - start));
    }

    // O(n)
    public static String godSolution(String text) {
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
        System.out.println("numberOfIterations:" + numberOfIterations);
        return new String(val, StandardCharsets.UTF_8);
    }

    //O(n)
    public static String badSolution(String text) {
        String reverse = "";
        for (var x=text.length() -1; x >= 0; x--) {
            reverse += text.charAt(x);
        }
        return reverse;
    }
}
