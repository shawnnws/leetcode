//package leetcode;
//
//import java.util.HashMap;
//import java.util.List;
//
//public class FindCommonCharacters {
//
//    public List<String> commonChars(String[] words) {
//
//        HashMap<String, Integer> charCount = new HashMap<String, Integer>();
//        for (int i = 0; i < words[0].length(); i++) {
//            if (!charCount.containsKey(words[0].substring(i, i + 1))) {
//                charCount.put(words[0].substring(i, i + 1), 1);
//            }
//            else {
//                charCount.put(words[0].substring(i, i + 1), charCount.get(words[0].substring(i + 1)) + 1);
//            }
//        }
//
//
//    }
//}
