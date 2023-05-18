package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestDistanceToChar {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> charPosition = new ArrayList<Integer>();
        int[] shortestDistToChar = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                charPosition.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int shortestDist = Math.abs(charPosition.get(0) - i);
            for (int j = 0; j < charPosition.size(); j++) {
                int distance = Math.abs(charPosition.get(j) - i);
                if (distance < shortestDist) {
                    shortestDist = distance;
                }
            }
            shortestDistToChar[i] = shortestDist;
        }
        return shortestDistToChar;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        ShortestDistanceToChar solution = new ShortestDistanceToChar();
        solution.shortestToChar(s, c);
        String answer = Arrays.toString(solution.shortestToChar(s,c));
        System.out.println(answer); 
    }
}
