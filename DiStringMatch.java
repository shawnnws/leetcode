package leetcode;

import java.util.ArrayList;

public class DiStringMatch {
    public int[] diStringMatch(String s) {
        int numIntegers = s.length() + 1;               //numIntegers = 4 + 1 = 5
        ArrayList<Integer> availNums = new ArrayList<>();
        int[] permutation = new int[numIntegers];

        for (int i = 0; i <numIntegers; i++) {          //s = "IDID"
            availNums.add(i);                           //availNums = [0, 1, 2, 3, 4]
        }

        for (int j = 0; j < s.length(); j++) {          //j=0
            if (s.charAt(j) == 'I') {                   //s.charAt(0) = "I"
                permutation[j] = availNums.get(0);      //availNums.get(0) = 0
                availNums.remove(0);                    //availNums = [1, 2, 3 ,4]
            }
            else if (s.charAt(j) == 'D') {
                permutation[j] = availNums.get(availNums.size() -1);
                availNums.remove(availNums.size() -1);
            }
        }
        permutation[s.length()] = availNums.get(0);
        return permutation;
    }
}
