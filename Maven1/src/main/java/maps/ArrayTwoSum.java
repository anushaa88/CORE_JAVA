package maps;
import java.util.HashMap;

public class ArrayTwoSum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two elements add up to the target sum.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each element and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // If the complement is found in the map, return the indices
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }
            // Otherwise, put the current element and its index in the map
            complementMap.put(nums[i], i);
        }
        // If no such pair is found, return null
        return null;
    }
}
