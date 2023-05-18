package leetcode;
import java.util.HashSet;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> allowedChars = new HashSet<>();
        int consistentCount = 0;

        for (int i = 0; i < allowed.length(); i++) {
            allowedChars.add(allowed.charAt(i));
        }

        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!allowedChars.contains(word.charAt(i))) {
                    isConsistent = false;
                }
            }
            if (isConsistent) {
                consistentCount +=1;
            }
        }
        return consistentCount;
    }
}
