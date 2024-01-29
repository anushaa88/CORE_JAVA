package test_maps;

import maps.ArrayTwoSum;

import java.util.Arrays;

public class ArrayTwoSumTest {
    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {10, 20, 30, 40, 50, 60}, // Input array
                {100, 50}, // Target sum
                {0, 1}, // Expected indices of the two elements that sum up to the target
                {20, 30, 40, 50}, // Input array
                {90, 40}, // Target sum
                {1, 3}, // Expected indices
                {2, 7, 11, 15}, // Input array
                {9, 18}, // Target sum
                {0, 1} // Expected indices
                // Add more test cases as needed
        };

        for (int i = 0; i < testCases.length; i += 3) {
            int[] nums = Arrays.copyOfRange(testCases[i], 0, testCases[i].length);
            int target = testCases[i + 1][0];
            int[] expectedIndices = Arrays.copyOfRange(testCases[i + 2], 0, testCases[i + 2].length);

            int[] result = ArrayTwoSum.twoSum(nums, target);

            System.out.println("Test Case " + (i / 3 + 1) + ":");
            System.out.println("Input Array: " + Arrays.toString(nums));
            System.out.println("Target Sum: " + target);
            System.out.println("Expected Indices: " + Arrays.toString(expectedIndices));
            if (result != null) {
                System.out.println("Actual Indices: " + Arrays.toString(result));
                if (Arrays.equals(result, expectedIndices)) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }
            } else {
                System.out.println("No two elements add up to the target sum.");
            }
            System.out.println();
        }
    }
}
