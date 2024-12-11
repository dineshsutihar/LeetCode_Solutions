class Solution {

    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int right = 0; // Pointer for the end of the valid range
        int maxBeauty = 0;

        // Iterate through the array with the left pointer
        for (int left = 0; left < nums.length; left++) {
            // Expand the right pointer while the range condition is met
            while (right < nums.length && nums[right] - nums[left] <= 2 * k) {
                right++;
            }
            // Update the maximum beauty based on the current range
            // We do not add 1 here as right is already pointing to one position beyond the valid range.
            maxBeauty = Math.max(maxBeauty, right - left);
        }
        return maxBeauty;
    }
}