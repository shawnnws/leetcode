package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstring {
    public int longestSubstring(String s) {

        int longest = 0;
        ArrayList<Character> charList = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (!charList.contains(s.charAt(i))) {
                charList.add(s.charAt(i));
            }
            else {
                charList.add(s.charAt(i));
                int numDeductions = charList.indexOf(s.charAt(i)) + 1;
                for (int j = 0; j < numDeductions; j++) {
                    charList.remove(0);
                }
            }
            if (charList.size() > longest) {
                longest = charList.size();
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        LongestSubstring solution = new LongestSubstring();
        System.out.println(solution.longestSubstring(s));
    }
}
