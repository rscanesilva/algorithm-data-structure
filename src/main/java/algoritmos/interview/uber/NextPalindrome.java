package algoritmos.interview.uber;

// Write a function that takes an integer as an input and return the next larger number that is a palindrome.
// Example Input: 1000
// Example Output: 1001
// Main class should be named 'Solution'
/*
   1221
   1222 - 12 22
   21 < 22
*/
class NextPalindrome {

    public static void main(String[] args) {
        System.out.println(getNextPalindrome(12320));
    }

    public static int getNextPalindrome(Integer i) {
        ++i;
        if (i <= 10) return 11;

        String input = i.toString();
        String sub1;
        String sub2;
        String center = "";

        if (input.length() % 2 == 0) {
            sub1 = input.substring(0, input.length() / 2);
            sub2 = input.substring(input.length() / 2);
        } else {
            sub1 = input.substring(0, (input.length() / 2));
            sub2 = input.substring((input.length() / 2) + 1);
            center = input.substring((input.length() / 2), (input.length() / 2) + 1);
        }

        var n1 = Integer.parseInt(inverse(sub1));
        var n2 = Integer.parseInt(sub2);

        if (n1 == n2) {
            return i;
        } else if (n1 > n2) {
            return Integer.parseInt(sub1 + center + n1);
        } else {
            Integer newValue = Integer.parseInt(sub1);
            ++newValue;
            return Integer.parseInt(newValue + center + inverse(newValue.toString()));
        }
    }

    public static String inverse(String text) {
        byte[] val = text.getBytes();
        int count = text.length();

        int n = count - 1;
        for (int j = (n - 1) >> 1; j >= 0; j--) {
            int k = n - j;
            byte cj = val[j];
            val[j] = val[k];
            val[k] = cj;
        }
        return new String(val);
    }
}
