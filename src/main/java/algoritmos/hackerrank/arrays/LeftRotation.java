package algoritmos.hackerrank.arrays;

public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int j = 0;
        int[] temp = new int[length];

        for(int i = d; i < length; i++, j++) {
            temp[j] = a[i];
        }
        if(j < length) {
            for(int i = 0; i < d; i++, j++) {
                temp[j] = a[i];
            }
        }
        return temp;
    }
}
