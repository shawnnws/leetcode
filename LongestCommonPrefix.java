package leetcode;

//Trie method

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        Integer[] wordLength = new Integer[strs.length];
        for (int k = 0; k < strs.length; k++) {
            wordLength[k] = strs[k].length();
        }
        Arrays.sort(wordLength);

        String longest = "";

        for (int i = 0; i < wordLength[0]; i++) {

            String prefix = strs[0].substring(0, i+1);
            boolean validPrefix = true;

            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].substring(0, i + 1).equals(prefix)) {
                    validPrefix = false;
                    break;
                }
            }
            if (validPrefix) {
                longest = prefix;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        LongestCommonPrefix solution = new LongestCommonPrefix();
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
