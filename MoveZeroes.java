package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int firstZeroIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 0) {
                firstZeroIndex++;
                continue;
            }
            if (nums[i+1] != 0) {
                nums[firstZeroIndex] = nums[i+1];
                nums[i+1] = 0;
                firstZeroIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3};
        System.out.println(Arrays.toString(nums));
        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
