package leetcode.challenges.easy;

import labels.Easy;
import labels.Solved;

import java.util.Arrays;

@Easy
@Solved
public class TwoSum {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int testTarget = 18;
        String actual = Arrays.toString(twoSum(testArray, testTarget));
        String expected = "[7, 8]";
        System.out.println(actual.equals(expected) ? "TwoSum is Solved your answer is correct!!!" : "Unfortunately your answer did not match "
                + "Actual " + actual + " Expected " + expected);
    }

    public static int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

}
/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 * You may assume that each input would have exactly one solution, and you may not use the same element twice.

 * You can return the answer in any order.


 * Example 1:

 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:

 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:

 * Input: nums = [3,3], target = 6
 * Output: [0,1]


 * Constraints:

 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */