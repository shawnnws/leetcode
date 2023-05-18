package leetcode;

public class MaxWordsInSentence {
    public int mostWordsFound(String[] sentences) {
        int mostWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] splitSentence = sentences[i].split(" ");
            int numWords = splitSentence.length;
            if (numWords > mostWords) {
                mostWords = numWords;
            }
        }
        return mostWords;
    }
}
