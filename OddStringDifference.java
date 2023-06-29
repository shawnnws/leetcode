package leetcode;

import java.util.*;

public class OddStringDifference {

    public String oddString(String[] words) {

        HashMap<String, Integer> differenceMap = new HashMap<String, Integer>();
        ArrayList<String> differenceArray = new ArrayList<String>();
        Integer[] diffIntArr = new Integer[words[0].length() - 1];
        String answer = "";
        int answerIndex = 0;

        for (int k = 0; k < words.length; k++) {

            for (int i = 0; i < words[k].length() - 1; i++) {
                diffIntArr[i] = (int) words[k].charAt(i + 1) - (int) words[k].charAt(i);
            }
            String diffIntArrString = Arrays.toString(diffIntArr);
            differenceArray.add(diffIntArrString);

            if (!differenceMap.containsKey(diffIntArrString)) {
                differenceMap.put(diffIntArrString, 1);
            } else {
                differenceMap.put(diffIntArrString, differenceMap.get(diffIntArrString) + 1);
            }
            System.out.println(differenceMap);
        }

        for (Map.Entry<String, Integer> set : differenceMap.entrySet()) {
                if (set.getValue() == 1) {
                    answerIndex = differenceArray.indexOf(set.getKey());
                    answer = words[answerIndex];
                }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"aaa","bob","ccc","ddd"};
        OddStringDifference solution = new OddStringDifference();
        String answer = solution.oddString(words);
        System.out.println(answer);
    }
}
