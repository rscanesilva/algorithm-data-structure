package algoritmos.hackerrank;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class RepeatedStrings {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */
    public static void main(String[] args) throws IOException {
        long result = RepeatedStrings.repeatedString("aba", 10);
        System.out.print(result);
    }

    public static long repeatedString(String text, long n) {
        if (text.equals("a")) {
            return n;
        }

        long result = 0, countA=0;

        for (int x=0; x<text.length(); x++) {
            if (text.charAt(x) == 'a') {
                countA++;
            }
        }

        result = countA * (n/text.length());

        long rest = n % text.length();
        for (var i=0; i<rest; i++) {
            if (text.charAt(i)=='a')
                result++;
        }

        return result;
    }
}
