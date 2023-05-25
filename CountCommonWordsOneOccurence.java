package leetcode;

import java.util.HashMap;

public class CountCommonWordsOneOccurence {

    // Define a function to check for the following;
    // 1. If a word is present in both word arrays
    // 2. If word is present in both arrays, check if it appears only once
    public boolean onceInBoth(HashMap<String, Integer> wordMap1, HashMap<String, Integer> wordMap2, String word) {
        if (wordMap1.containsKey(word) && wordMap2.containsKey(word)) {
            if (wordMap1.get(word) == 1 && wordMap2.get(word) == 1) {
                return true;
            }
        }
        return false;
    }

    public int countWords(String[] words1, String[] words2) {

        // Insert the elements of both word arrays into their respective HashMaps,
        // with the word as Key and their count as Value.
        HashMap<String, Integer> wordMap1 = new HashMap<String, Integer>();
        HashMap<String, Integer> wordMap2 = new HashMap<String, Integer>();
        int count = 0;

        for (String word: words1) {
            if (!wordMap1.containsKey(word)) {
                wordMap1.put(word, 1);
            }
            else {
                wordMap1.put(word, wordMap1.get(word) + 1);
            }
        }

        for (String word: words2) {
            if (!wordMap2.containsKey(word)) {
                wordMap2.put(word, 1);
            }
            else {
                wordMap2.put(word, wordMap2.get(word) + 1);
            }
        }

        // First, we check which array is the shorter one and do the check with our defined function on it.
        // This is so that we can skip the extra iterations if we were to use the longer array.
        // We then use our defined function on each word while iterating through the array,
        // and increment our count if the word appears in both arrays only once.
        if (words1.length < words2.length) {
            for (String word: words1) {
                if (onceInBoth(wordMap1, wordMap2, word)) {
                    count++;
                }
            }
        }
        else {
            for (String word: words2) {
                if (onceInBoth(wordMap1, wordMap2, word)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};

        CountCommonWordsOneOccurence solution = new CountCommonWordsOneOccurence();
        System.out.println(solution.countWords(words1, words2));
    }
}
