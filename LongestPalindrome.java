package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {

        int numChar = s.length();
        System.out.println(numChar);

        if (s.length() == 1) {
            return 1;
        }

        HashMap<Character, Integer> mapOfS = new HashMap<Character, Integer>();
        ArrayList<Character> oddChars = new ArrayList<Character>();

        for (int i = 0; i < numChar; i++) {
            if (!mapOfS.containsKey(s.charAt(i))) {
                mapOfS.put(s.charAt(i), 1);
            } else {
                mapOfS.put(s.charAt(i), mapOfS.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(mapOfS);

        for (char character : mapOfS.keySet()) {
            if (mapOfS.get(character) % 2 == 1) {
                oddChars.add(character);
            }
        }
        if (oddChars.size() == 0){
            return s.length();
        }
        System.out.println(oddChars);
        System.out.println(oddChars.size());
        return numChar - (oddChars.size() - 1);
    }
//        System.out.println(oddChars);
//        System.out.println(mapOfS.get(oddChars.get(0)));
//        System.out.println(mapOfS.get(oddChars.get(1)));
//        System.out.println(mapOfS.get(oddChars.get(2)));
//        System.out.println(oddChars.size());

//        for (int j = 0; j < oddChars.size() -1; j++) {
//            if (mapOfS.get(oddChars.get(j)) <= mapOfS.get(oddChars.get(j + 1))) {
//                numChar -= mapOfS.get(oddChars.get(j));
//                oddChars.remove(j);
//                j--;
//            }
//            else if (mapOfS.get(oddChars.get(j)) > mapOfS.get(oddChars.get(j + 1))) {
//                numChar -= mapOfS.get(oddChars.get(j+1));
//                oddChars.remove(j+1);
//                j--;
//            }
//            System.out.println(numChar);
//        }



    public static void main(String[] args) {
        String s = "bb";
        LongestPalindrome solution = new LongestPalindrome();
        System.out.println(solution.longestPalindrome(s));
    }
}
