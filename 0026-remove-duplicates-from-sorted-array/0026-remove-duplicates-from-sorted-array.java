class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: empty array
        if (nums.length == 0) {
            return 0;
        }

        // Initialize index for the new array (demo array)
        int k = 0;

        // Iterate through the input array to check for duplicates
        for (int i = 1; i < nums.length; i++) {
            // If a unique element is found, store it in the demo array
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i - 1];
            }
        }

        // Store the last element of the input array in the demo array
        nums[k++] = nums[nums.length - 1];

        // The demo array now contains the unique elements in the order they were present
        return k;
    }
}
