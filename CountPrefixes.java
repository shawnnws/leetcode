package leetcode;

public class CountPrefixes {
    public int countPrefixes(String[] words, String pref) {

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
        String prefix = "at";

        CountPrefixes solution = new CountPrefixes();
        int answer = solution.countPrefixes(words, prefix);
        System.out.println(answer);
    }
}
