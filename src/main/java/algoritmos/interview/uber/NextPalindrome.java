package algoritmos.interview.uber;

// Write a function that takes an integer as an input and return the next larger number that is a palindrome.
// Example Input: 1000
// Example Output: 1001
// Main class should be named 'Solution'
/*
   input -> 1221
   nextValue -> 1222
   return -> 1331

   12 22
*/
class NextPalindrome {

    public static void main(String[] args) {
        System.out.println(getNextPalindrome(12320));
    }

    public static int getNextPalindrome(Integer n) {
        ++n;
        if (n <= 10) return 11;

        String input = n.toString();
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

        var firstInverseInt = Integer.parseInt(inverse(sub1));
        var lastInt = Integer.parseInt(sub2);

        if (firstInverseInt == lastInt) {
            return n;
        } else if (firstInverseInt > lastInt) {
            return Integer.parseInt(sub1 + center + firstInverseInt);
        } else {
            var newFirstInt = Integer.parseInt(sub1) + 1;
            return Integer.parseInt(newFirstInt + center + inverse(Integer.toString(newFirstInt)));
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
