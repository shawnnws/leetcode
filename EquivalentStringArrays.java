package leetcode;

public class EquivalentStringArrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        // Instantiate a StringBuilder for each string array.
        // Iterate through each word and connect them together using the StringBuilder.
        StringBuilder firstWord = new StringBuilder();
        StringBuilder secondWord = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            firstWord.append(word1[i]);
        }
        for (int j = 0; j < word2.length; j++) {
            secondWord.append(word2[j]);
        }
        return firstWord.toString().equals(secondWord.toString());
    }
}
