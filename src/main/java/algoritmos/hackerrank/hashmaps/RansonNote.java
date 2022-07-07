package algoritmos.hackerrank.hashmaps;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class RansonNote {
    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void main(String[] args) throws IOException {
        RansonNote.checkMagazine(Arrays.asList("The", "Death", "Note", "note"), Arrays.asList("The", "Death", "Note", "note"));
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        Hashtable<String, Integer> magazineWords = new Hashtable<>();
        for (String s: magazine) {
            int count = magazineWords.get(s) != null ? magazineWords.get(s) + 1 : 1;
            magazineWords.put(s, count);
        }

        for (String word: note) {
            if (!magazineWords.containsKey(word) || magazineWords.get(word) < 1) {
                System.out.println("No");
                return;
            } else {
                magazineWords.put(word, magazineWords.get(word)-1);
            }
        }
        System.out.println("Yes");

    }

}

