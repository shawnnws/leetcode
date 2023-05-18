package leetcode;

public class GivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int prefCount = pref.length();

        for (String word : words) {
            if (word.length() >= prefCount && word.substring(0,prefCount).equals(pref)) {
                count += 1;
            }
        }
        return count;
    }
}
