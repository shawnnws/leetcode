package leetcode;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {

        int numOfWords = 0;
        int lastIndex = 0;

        for (lastIndex = 0; lastIndex < s.length(); lastIndex++) {
            char currentChar = s.charAt(lastIndex);
            if (currentChar == ' ') {
                numOfWords += 1;
            }
            if (numOfWords == k){
                break;
            }
        }
        return s.substring(0, lastIndex);

//        String[] splittedSentence = s.split(" ");
//        StringBuilder truncatedSentence = new StringBuilder();
//
//        for (int i = 0; i < k; i++) {
//            truncatedSentence.append(splittedSentence[i]);
//        }
//        return truncatedSentence.toString();
    }
}
