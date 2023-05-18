package leetcode;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                result[0] = numToIndex.get(complement);
                result[1] = i;
            } else{
                numToIndex.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        Solution solution = new Solution();
        int[] answer = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(answer));
    }
}
