package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class KthDistinctString {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> count = new HashMap<>();
        ArrayList<String> distinctList = new ArrayList<>();
        String kthString = "";

        for (int i = 0; i < arr.length; i++) {
            if (count.size() == 0) {
                count.put(arr[i], 1);
            }
            else if (count.containsKey(arr[i])) {
                count.put(arr[i],count.get(arr[i]) + 1);
            }
            else {
                count.put(arr[i], 1);
            }
        }

        for (String word : arr) {
            if (count.get(word) == 1) {
                distinctList.add(word);
            }
        }

        if (distinctList.size() < k) {
            return kthString;
        }
        else {
            kthString = distinctList.get(k - 1);
        }

        return kthString;
    }
}


