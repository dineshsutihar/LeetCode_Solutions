class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;
            
            // Check if there is a carry
            if (digits[i] <= 9) {
                // No carry, stop and return the array
                return digits;
            }
            
            // Carry, set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If we reach here, it means there is a carry in the leftmost digit
        // Create a new array with an additional digit
        int[] result = new int[n + 1];
        result[0] = 1;
        
        return result;
    }
}
