package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MinIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {

        int indexSum = list1.length + list2.length;
        ArrayList<String> resultList = new ArrayList<String>();

        for (int i = 0; i < list1.length; i++) {
            String string1ToCompare = list1[i];

            for (int j = 0; j < list2.length; j++) {
                String string2ToCompare = list2[j];
                if (string1ToCompare.equals(string2ToCompare) && i + j < indexSum) {
                    indexSum = i + j;
                    resultList.clear();
                    resultList.add(string1ToCompare);
                } else if (string1ToCompare.equals(string2ToCompare) && i+j == indexSum) {
                    resultList.add(string1ToCompare);
                }
            }
        }

        String[] answer = new String[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            answer[k] = resultList.get(k);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        MinIndexSumOfTwoLists solution = new MinIndexSumOfTwoLists();
        String[] answer = solution.findRestaurant(list1, list2);
        System.out.println(Arrays.toString(answer));
    }
}
