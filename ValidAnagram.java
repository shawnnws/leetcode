package leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> mapOfS = new HashMap<>();
        HashMap<Character, Integer> mapOfT = new HashMap<>();
        // boolean isAnagram = true;

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!mapOfS.containsKey(s.charAt(i))) {
                mapOfS.put(s.charAt(i), 1);
            } else {
                mapOfS.put(s.charAt(i), mapOfS.get(s.charAt(i)) + 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (!mapOfT.containsKey(t.charAt(j))) {
                mapOfT.put(t.charAt(j), 1);
            } else {
                mapOfT.put(t.charAt(j), mapOfT.get(t.charAt(j)) + 1);
            }
        }

        for (int h = 0; h < s.length(); h++) {
            if (!mapOfS.containsKey(t.charAt(h)) || !mapOfT.containsKey(s.charAt(h)) || !mapOfS.get(s.charAt(h)).equals(mapOfT.get(s.charAt(h)))) {
                return false;
            }
        }
        return true;
    }
}