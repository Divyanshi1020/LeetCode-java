class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop: pick the first number
        for (int i = 0; i < nums.length; i++) {
            // Inner loop: pick the second number (after i)
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two numbers add up to target
                if (nums[i] + nums[j] == target) {
                    // Return their indices
                    return new int[] { i, j };
                }
            }
        }

        
        return new int[] {-1, -1};
    }
}
