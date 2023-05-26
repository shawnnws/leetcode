package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRow {

    String rowOne = "qwertyuiop";
    String rowTwo = "asdfghjkl";
    String rowThree = "zxcvbnm";

    // We define a function to help us determine which keyboard row to use based on the first letter of the string.
    public String stringToUse(String word) {
        String firstLetter = word.substring(0, 1);
        if (rowOne.contains(firstLetter)) {
            return rowOne;
        }
        else if (rowTwo.contains(firstLetter)) {
            return rowTwo;
        }
        else {
            return rowThree;
        }
    }

    public String[] findWords(String[] words) {

        // We define an arraylist for our answer first as we do not know for sure how many strings will be in our answer.
        ArrayList<String> answerList = new ArrayList<String>();

        // We assign a temporary String variable to be the lowercase of the String to do the checking of whether all letters
        // are in the same keyboard row so that when we add the original word into our answer array it will not be the
        // lower case one.
        for (String word : words) {
            String wordToLower = word.toLowerCase();
            String rowToUse = stringToUse(wordToLower);
            boolean isValid = true;

            // If we encounter a character that does not belong in the same keyboard row as the previous character, we
            // set isValid to false and break from the current iteration to move on to the next String in words array.
            for (int i = 0; i < word.length(); i++) {
                if (!rowToUse.contains(wordToLower.substring(i, i + 1))) {
                    isValid = false;
                    break;
                }
            }

            // If, after iterating through all characters in the word, isValid is still true, that means all characters
            // in the word can be typed from the same keyboard row, hence we add the non-lowercased word into our
            // solution arraylist.
            if (isValid) {
                answerList.add(word);
            }
        }

        // After we obtain our answer array list, we iterate through each word in the array list and add them into our
        // final fixed-sized answer array and return it.
        String[] answer = new String[answerList.size()];
        for (int j = 0; j < answerList.size(); j++) {
            answer[j] = answerList.get(j);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        KeyboardRow solution = new KeyboardRow();
        System.out.println(Arrays.toString(solution.findWords(words)));
    }
}
