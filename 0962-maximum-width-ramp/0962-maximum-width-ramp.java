class Solution {

    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> indicesStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (indicesStack.isEmpty() || nums[indicesStack.peek()] > nums[i]) {
                indicesStack.push(i);
            }
        }

        int maxWidth = 0;

        for (int j = n - 1; j >= 0; j--) {
            while (
                !indicesStack.isEmpty() && nums[indicesStack.peek()] <= nums[j]
            ) {
                maxWidth = Math.max(maxWidth, j - indicesStack.pop());
            }
        }

        return maxWidth;
    }
}