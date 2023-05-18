package leetcode;

public class CountPrefixes {
    public int countPrefixes(String[] words, String s) {

        int count = 0;
        boolean isPrefix = true;

        for (String word: words) {
            int numChar = word.length();
            if (numChar <= s.length() && s.substring(0,numChar).equals(word)) {
                count += 1;
            }
        }
        return count;
    }
}
