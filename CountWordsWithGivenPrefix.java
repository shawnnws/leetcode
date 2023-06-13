package leetcode;

public class CountWordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String word: words) {
            if (word.startsWith(pref)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";

        CountWordsWithGivenPrefix solution = new CountWordsWithGivenPrefix();
        int answer = solution.prefixCount(words, pref);
        System.out.println(answer);
    }
}