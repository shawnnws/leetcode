package leetcode;

public class CheckIfStringIsPrefixOfArray {
    public boolean isPrefixString(String s, String[] words) {

        String combined = "";
        boolean isPrefix = false;

        for (String word : words) {
            combined += word;
            if (combined.equals(s)) {
                isPrefix = true;
            }
        }
        return isPrefix;
    }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        CheckIfStringIsPrefixOfArray solution = new CheckIfStringIsPrefixOfArray();
        boolean answer = solution.isPrefixString(s, words);
        System.out.println(answer);
    }
}
