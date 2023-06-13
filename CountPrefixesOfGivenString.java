package leetcode;

public class CountPrefixesOfGivenString {
    public int countPrefixes(String[] words, String s) {

        int count = 0;

        for (String word: words) {
            if (s.startsWith(word)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";

        CountPrefixesOfGivenString solution = new CountPrefixesOfGivenString();
        int answer = solution.countPrefixes(words, s);
        System.out.println(answer);
    }
}
