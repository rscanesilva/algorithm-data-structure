package algoritmos.codesignal;

public class LargestSumContiguousSubarray {
    /*
        Given an array of integers, get the highest value of the sum between the elements of contiguous subarrays.
        kadane's algorithm:
            "Key question" -> What is bigger?
                1) sum the current position with the variable 'sum' ?
                2) start the sum at the current position?

            Once this is done, validate if sum > sumMax, if so, sumMax assumes the value of sum.
     */
    public static int solution (int[] array) {
        int maxSum = array[0];
        int sum = maxSum;
        var i=1;
        while (i< array.length) {
            var count = sum+array[i];
            sum = Math.max(count, array[i]);
            if (sum > maxSum) maxSum = sum;
            i++;
        }
        return maxSum;
    }

    //Same as above, but using java's Math.max function to improve visibility
    public static int solution2 (int[] array) {
        int maxSum = array[0];
        int sum = maxSum;
        var i=1;
        while (i< array.length) {
            sum = Math.max(sum + array[i], array[i]);
            maxSum = Math.max(sum, maxSum);
            i++;
        }
        return maxSum;
    }


    //Ignore sum negativeValues
    public static int solution3 (int[] a) {
        int max = Integer.MIN_VALUE, sum = 0;
        int i = 0;
        while (i < a.length) {
            sum = sum + a[i];
            if (max < sum) max = sum;
            if (sum < 0) sum = 0;
            i++;
        }
        return max;
    }

    //Ignore sum negativeValues with Math.max()
    public static int solution4 (int[] a) {
        int max = Integer.MIN_VALUE, sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
            i++;
        }
        return max;
    }
}
