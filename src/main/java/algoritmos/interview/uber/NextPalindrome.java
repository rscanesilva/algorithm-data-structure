package algoritmos.interview.uber;

import algoritmos.ReverseString;

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

    public static int getNextPalindrome(Integer n) {
        if (n<=10) return 11;
        ++n;
        String sub1, sub2, center="", nStr= n.toString();
        sub1 = nStr.substring(0, nStr.length()/2);

        if (nStr.length() % 2 == 0) {
            sub2 = nStr.substring(nStr.length()/2);
        } else {
            sub2 = nStr.substring((nStr.length()/2)+1);
            center = nStr.substring(nStr.length()/2, (nStr.length()/2)+1);
        }

        String reverseSub1 = ReverseString.reverse(sub1);

        if (reverseSub1.equals(sub2)) {
            return n;
        } else if (Integer.parseInt(reverseSub1) > Integer.parseInt(sub2)) {
            return  Integer.parseInt(sub1+center+reverseSub1);
        } else {
            Integer newFirstInt = Integer.parseInt(sub1)+1;
            return Integer.parseInt(newFirstInt + center + ReverseString.reverse(newFirstInt.toString()));
        }
    }
}
