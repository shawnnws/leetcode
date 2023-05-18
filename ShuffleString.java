package leetcode;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {

        char[] sortedString = new char[s.length()];
        String finalString = "";

        for (int i = 0; i < s.length(); i++) {
            int positionIndex = indices[i];
            char charAtIndex = s.charAt(i);
            sortedString[positionIndex] = charAtIndex;
        }
        for (char eachChar : sortedString) {
            finalString += eachChar;
        }
        return finalString;
    }
}
