package leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        boolean containsDuplicate = false;

        for (int num : nums) {
            if (!numsMap.containsKey(num)) {
                numsMap.put(num, 1);
            } else {
                numsMap.put(num, numsMap.get(num) + 1);
            }

            if (numsMap.get(num) == 2) {
                return true;
            }
        }
        return containsDuplicate;
    }
}
