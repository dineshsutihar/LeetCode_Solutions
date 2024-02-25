class Solution {
    public int reverse(int x) {
        // Define the 32-bit integer limits
        final int INT32_MIN = Integer.MIN_VALUE;
        final int INT32_MAX = Integer.MAX_VALUE;

        // Use a long variable to store the reversed integer to handle potential overflow
        long reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for potential overflow before updating the reversed integer
            if (reversed > INT32_MAX / 10 || reversed < INT32_MIN / 10) {
                return 0;
            }
            
            reversed = reversed * 10 + digit;

            // Move to the next digit
            x /= 10;
        }

        // if (reversed < INT32_MIN || reversed > INT32_MAX) {
        //     return 0;
        // }

        return (int) reversed;
    }
}
