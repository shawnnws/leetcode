package leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {

        // Instantiate an arraylist to add in the valid words.
        ArrayList<String> answerList = new ArrayList<String>();

        /*
        The idea here is that for each word in words, we will need to compare it to all the
        other words in the array to see if it is a substring of those words.
        - First, we initialize a new string to contain the current word we are iterating.
        - Then, while iterating through words, we skip the current word and check if the other
          words has the current word as a substring.
        - Lastly, if any word in words has the current word as a substring and our answer list
          does not contain it, then we add the current word into our answer list arraylist.
         */
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            for (int j = 0; j < words.length; j++) {
                if (j != i) {
                    if (words[j].contains(currentWord) && !answerList.contains(currentWord)) {
                        answerList.add(currentWord);
                    }
                }
            }
        }
        return answerList;
    }

    public static void main(String[] args) {
        String[] words = {"leetcode","et","code"};
        StringMatchingInAnArray solution = new StringMatchingInAnArray();
        List<String> answer = solution.stringMatching(words);
        System.out.println(answer);
    }
}
