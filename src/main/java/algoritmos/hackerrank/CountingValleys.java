package algoritmos.hackerrank;

import java.io.IOException;

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    public static void main(String[] args) throws IOException {
        int result = CountingValleys.solution2(8, "UDDDUDUU");
        System.out.println(result);
    }

    public static int solution1(int steps, String path) {
        int valleys = 0;
        int currentAlt = 0;
        int prevAlt = 0;
        for (var x=0; x<steps; x++) {
            prevAlt = currentAlt;
            currentAlt = switch (String.valueOf(path.charAt(x))) {
                case "D" -> --currentAlt;
                case "U" -> ++currentAlt;
                default -> currentAlt;
            };
            if (prevAlt < 0 && currentAlt == 0) {
                valleys++;
            }
        }
        return valleys;
    }

    public static int solution2(int steps, String path) {
        int valleys = 0;
        int lvl = 0;   // current level
        for(char c : path.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;

            if(lvl == 0 && c == 'U')
                ++valleys;
        }
        return valleys;
    }
}

