class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the front
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
    
    
}