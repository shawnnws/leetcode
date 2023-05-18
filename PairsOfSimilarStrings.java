package leetcode;

import java.util.HashSet;

public class PairsOfSimilarStrings {
    public int similarPairs(String[] words) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean similar = true;
            HashSet<Character> letters = new HashSet<Character>();
            for (int j = 0; j < words[i].length(); j++) {
                letters.add(words[i].charAt(j));
            }

            for (int k = 1; k < words.length; k++) {
                for (int h = 0; h < words[k].length(); h++) {
                    if (!letters.contains(words[k].charAt(h))) {
                        similar = false;
                    }
                }
            }
            if (similar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        PairsOfSimilarStrings solution = new PairsOfSimilarStrings();
        int answer = solution.similarPairs(words);
        System.out.println(answer);
    }
}
