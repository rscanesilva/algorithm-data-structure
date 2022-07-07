package algoritmos.hackerrank;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class JumpingOnTheClouds {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */
    public static void main(String[] args) {
        System.out.println(solution1(Arrays.asList(0, 0, 0, 1, 0, 0)));
    }
    public static int solution1(List<Integer> c) {
        int jumps = -1;
        for (var x=0; x<c.size(); x++, jumps++){
            if (x+2 < c.size() && c.get(x+2) == 0) ++x;
        }
        return jumps;
    }
}