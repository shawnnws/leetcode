package leetcode;

import java.util.HashMap;

// CAN BE DONE IN 0(1) SPACE
public class MajorityElement {
//    public int majorityElement(int[] nums) {
//        int maxCount = 0;
//        int majorityNum = 0;
//        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!numsMap.containsKey(nums[i])) {
//                numsMap.put(nums[i], 1);
//            } else {
//                numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
//            }
//
//            if (numsMap.get(nums[i]) > maxCount) {
//                maxCount = numsMap.get(nums[i]);
//                majorityNum = nums[i];
//            }
//        }
//        System.out.println(numsMap);
//        return majorityNum;
//    }

    public int majorityElement(int[] nums) {
        int bigBoss = nums[0];
        int bossCount = 1;

        if (nums.length == 1) {
            return bigBoss;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == bigBoss) {
                bossCount += 1;
            } else {
                bossCount -= 1;
            }

            if (bossCount == 0) {
                bigBoss = nums[i + 1];
            }
        }
        return bigBoss;
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 5};
        MajorityElement solution = new MajorityElement();
        System.out.println(solution.majorityElement(nums));
    }
}
