package LeetCode.TwoSum;

import java.util.Arrays;
//import LeetCode.TwoSum.TwoSumBruteForce.TwoSum;
import LeetCode.TwoSum.TwoSumHashTable.TwoSum;


public class TwoSumTest {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test Case 1: Example from Leet Code
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        test(nums1, target1, new int[]{0, 1}, solution);

        //Test Case 2: Example from Leet Code
        int[] nums2 = {3, 4, 2};
        int target2 = 6;
        test(nums2, target2, new int[]{1, 2}, solution);

        //Test Case 3: Test for Self
        int[] nums3 = {-2, -3, -4, -5, -6, -9};
        int target3 = -10;
        test(nums3, target3, new int[]{2, 4}, solution);

    }

    private static void test(int[] numbs, int target, int[] expected, TwoSum solution) {
        int[] result = solution.twoSum(numbs, target);

        System.out.println("\nInput Sums: "+ Arrays.toString(numbs));
        System.out.println("Target: "+ target);
        System.out.println("Expected Output: "+ Arrays.toString(expected));
        System.out.println("Actual Output"+ Arrays.toString(result));
        if (Arrays.equals(result, expected)) {
            System.out.println("Test Passed!\n");
        } else {
            System.out.println("Test Failed!\n");
        }
    }
}
