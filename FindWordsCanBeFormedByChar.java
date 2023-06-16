//package leetcode;
//
//import java.util.HashMap;
//
//public class FindWordsCanBeFormedByChar {
//    public int countCharacters(String[] words, String chars) {
//
//        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
//        for (int i = 0; i < chars.length(); i++) {
//            if (!charMap.containsKey(chars.charAt(i))) {
//                charMap.put(chars.charAt(i), 0);
//            }
//            else {
//                charMap.put(chars.charAt(i), charMap.get(chars.charAt(i)) + 1);
//            }
//        }
//
//        int sum = 0;
//
//        for (String word : words) {
//            boolean canBeFormed = true;
//            HashMap<Character, Integer> wordMap = new HashMap<Character, Integer>();
//            for (int j = 0; j < word.length(); j++) {
//                if (!wordMap.containsKey(chars.charAt(j))) {
//                    wordMap.put(chars.charAt(j), 0);
//                }
//                else {
//                    wordMap.put(chars.charAt(j), wordMap.get(chars.charAt(j)) + 1);
//                }
//
//
//            }
//        }
//    }
//}


//class Solution {
//    public int countCharacters(String[] words, String chars) {
//        int arr1[] = new int[26];
//        for(int i=0;i<chars.length();i++){
//            int num = chars.charAt(i)-97;
//            arr1[num]++;
//        }
//        int len=0;
//        for(int i=0;i<words.length;i++){
//            String str = words[i];
//            int arr2[] = new int[26];
//            for(int j=0;j<str.length();j++){
//                int num = str.charAt(j)-97;
//                arr2[num]++;
//            }
//            int flag=0;
//            for(int k=0;k<26;k++){
//                if(arr2[k]>arr1[k]){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0)
//                len=len+str.length();
//        }
//        return len;
//    }
//}