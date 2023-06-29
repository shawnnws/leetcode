package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindResultantArrayAfterAnagrams {

    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> finalArrayList = new ArrayList<String>(Arrays.asList(words));

        for (int i = 1; i < finalArrayList.size(); i++) {
            if (finalArrayList.get(i).length() == finalArrayList.get(i-1).length()) {

                char[] wordOneArray = finalArrayList.get(i).toCharArray();
                char[] wordTwoArray = finalArrayList.get(i-1).toCharArray();
                Arrays.sort(wordOneArray);
                Arrays.sort(wordTwoArray);

                if (Arrays.equals(wordOneArray, wordTwoArray)) {
                    finalArrayList.remove(finalArrayList.get(i));
                    i--;
                }
            }
        }
        return finalArrayList;
    }

    public static void main(String[] args) {
        String[] words = {"a","b","c","d","e"};
        FindResultantArrayAfterAnagrams solution = new FindResultantArrayAfterAnagrams();
        List<String> result = solution.removeAnagrams(words);
        System.out.println(result);
    }
}

// First solution, longer and less efficient:
//    public HashMap<Character, Integer> convertStringToMap(String word) {
//        HashMap<Character, Integer> stringToMap = new HashMap<Character, Integer>();
//        for (int i = 0; i < word.length(); i++) {
//            if (!stringToMap.containsKey(word.charAt(i))) {
//                stringToMap.put(word.charAt(i), 1);
//            } else {
//                stringToMap.put(word.charAt(i), stringToMap.get(word.charAt(i)) + 1);
//            }
//        }
//        return stringToMap;
//    }
//
//    public List<String> removeAnagrams(String[] words) {
//        ArrayList<String> finalArrayList = new ArrayList<String>(Arrays.asList(words));
//        for (int j = 1; j < finalArrayList.size(); j++) {
//
//            if (finalArrayList.get(j).length() == finalArrayList.get(j-1).length()) {
//                HashMap<Character, Integer> wordOneMap = convertStringToMap(finalArrayList.get(j));
//                HashMap<Character, Integer> wordTwoMap = convertStringToMap(finalArrayList.get(j-1));
//
//                if (wordOneMap.equals(wordTwoMap)) {
//                    finalArrayList.remove(finalArrayList.get(j));
//                    j--;
//                }
//            }
//        }
//        return finalArrayList;
//    }