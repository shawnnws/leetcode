package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String alphaNum = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        boolean isPalindrome = true;

        if (alphaNum.length() == 0) {
            return isPalindrome;
        }

        for (int i = 0; i < alphaNum.length() / 2; i++) {
            int tailPointer = alphaNum.length() - 1 - i;
            if (alphaNum.charAt(i) != alphaNum.charAt(tailPointer)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
