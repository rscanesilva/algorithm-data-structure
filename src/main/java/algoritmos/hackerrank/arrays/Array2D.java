package algoritmos.hackerrank.arrays;

import java.util.List;

/*
 * @Link
 * https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class Array2D {
    public static int hourglassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i < arr.size()-2; i++) {
            List<Integer> row = arr.get(i);
            List<Integer> row2 = arr.get(i+1);
            List<Integer> row3 = arr.get(i+2);

            for (int x=0; x < row.size()-2; x++) {
                int sum = row.get(x) + row.get(x+1) + row.get(x+2)
                        + row2.get(x+1)
                        + row3.get(x) + row3.get(x+1) + row3.get(x+2);
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}