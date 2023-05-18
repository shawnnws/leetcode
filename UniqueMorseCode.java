package leetcode;
import java.util.HashSet;

public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> morseSet = new HashSet<String>();

        for (int i = 0; i < words.length; i++) {
            StringBuilder morseConverted = new StringBuilder();

            for (int j = 0; j < words[i].length(); j++) {
                int morseIndex = words[i].charAt(j) - (int) 'a';
                morseConverted.append(morseCode[morseIndex]);
            }
            morseSet.add(morseConverted.toString());
        }
        return morseSet.size();
    }
}
