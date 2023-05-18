package leetcode;

import java.util.Arrays;

//ONLY WORKS IF GIVEN ARRAY IS SORTED
//V2 SOLUTION FOR NON-SORTED ARRAY?
public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {

        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int listIndex = nums.length - 1;
        int[] sortedSquare = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[leftPointer] * nums[leftPointer] >= nums[rightPointer] * nums[rightPointer]) {
                sortedSquare[listIndex] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
                listIndex--;
            } else {
                sortedSquare[listIndex] = nums[rightPointer] * nums[rightPointer];
                rightPointer--;
                listIndex--;
            }
        }
        return sortedSquare;
    }

    public static void main(String[] args) {
        int[] nums = {-10, -20, 50, 4, 5};
        SquaresSortedArray solution = new SquaresSortedArray();
        System.out.println(Arrays.toString(solution.sortedSquares(nums)));
    }
}
