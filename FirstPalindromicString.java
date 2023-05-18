package leetcode;

public class FirstPalindromicString {
    public String firstPalindrome(String[] words) {


        String firstPalindrome = "";

        //For each word in words.
        for (int i = 0; i < words.length; i++) {

            boolean isPalindrome = true;

            if (words[i].length() == 1) {
                firstPalindrome = words[i];
                break;
            }

            //Check each letter in each word.
            for (int j = 0; j < words[i].length() / 2; j++) {
                int tailPointer = words[i].length() - j - 1;
                if (words[i].charAt(j) != words[i].charAt(tailPointer)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                firstPalindrome = words[i];
                break;
            }
        }
        return firstPalindrome;
    }
}