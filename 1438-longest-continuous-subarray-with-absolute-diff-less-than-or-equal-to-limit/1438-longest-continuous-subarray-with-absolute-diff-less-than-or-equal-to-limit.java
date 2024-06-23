class Solution {

    public int longestSubarray(int[] nums, int limit) {
        // TreeMap to maintain the elements within the current window
        TreeMap<Integer, Integer> window = new TreeMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < nums.length; ++right) {
            window.put(nums[right], window.getOrDefault(nums[right], 0) + 1);

            // Check if the absolute difference between the maximum and minimum values in the current window exceeds the limit
            while (window.lastKey() - window.firstKey() > limit) {
                // Remove the element at the left pointer from the TreeMap
                window.put(nums[left], window.get(nums[left]) - 1);
                if (window.get(nums[left]) == 0) {
                    window.remove(nums[left]);
                }
                // Move the left pointer to the right to exclude the element causing the violation
                ++left;
            }

            // Update maxLength with the length of the current valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}