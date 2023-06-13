package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class CountVowelStringsInRange {
    public int vowelStrings(String[] words, int left, int right) {

        /*
        Initiate an int to keep track of number of words that is accepted.
        Add vowels into a String ArrayList for us to check against. We can use a HashSet too.
         */
        int count = 0;
        ArrayList<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        /*
        Iterate through the given String Array from index "left" to index "right".
        Initialize 2 Strings for first and last character of word and check if both characters are
        inside the vowels ArrayList.
         */
        for (int i = left; i < right + 1; i++) {
            String first = words[i].substring(0,1);
            String second = words[i].substring(words[i].length() - 1);
            if (vowels.contains(first) && vowels.contains(second)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"are","amy","u"};
        int left = 0;
        int right = 2;

        CountVowelStringsInRange solution = new CountVowelStringsInRange();
        int answer = solution.vowelStrings(words, left, right);
        System.out.println(answer);
    }
}
