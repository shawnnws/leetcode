package leetcode;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() == 0 || ransomNote.length() > magazine.length()) {
            return false;
        }

        HashMap<Character, Integer> ransomMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        boolean canConstruct = true;

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!ransomMap.containsKey(ransomNote.charAt(i))) {
                ransomMap.put(ransomNote.charAt(i), 1);
            } else {
                ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i)) + 1);
            }
        }
        System.out.println(ransomMap);

        for (int j = 0; j < magazine.length(); j++) {
            if (!magazineMap.containsKey(magazine.charAt(j))) {
                magazineMap.put(magazine.charAt(j), 1);
            } else {
                magazineMap.put(magazine.charAt(j), magazineMap.get(magazine.charAt(j)) + 1);
            }
        }
        System.out.println(magazineMap);

        for (int h = 0; h < ransomNote.length(); h++) {
//            if (magazineMap.containsKey(ransomNote.charAt(h)) && ransomMap.get(ransomNote.charAt(h)) <= magazineMap.get(ransomNote.charAt(h))) {
//                canConstruct = true;
//            }
            if (!(magazineMap.containsKey(ransomNote.charAt(h)) && ransomMap.get(ransomNote.charAt(h)) <= magazineMap.get(ransomNote.charAt(h)))) {
                canConstruct = false;
            }
        }
        return canConstruct;
    }

    public static void main(String[] args) {
        String ransom = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";

        RansomNote solution = new RansomNote();
        System.out.println(solution.canConstruct(ransom, magazine));
    }
}
