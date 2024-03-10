class Solution {
    public int divide(int dividend, int divisor) {
        // Handling edge case where dividend is Integer.MIN_VALUE and divisor is -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Checking if the result will be negative
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Converting dividend and divisor to long and taking their absolute values
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        // Initializing result to store the quotient
        int result = 0;

        // Performing division without using multiplication, division, and mod operator
        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;

            // Finding the largest multiple of divisor that can be subtracted from dividend without making it negative
            while (dvd >= (temp << 1)) {
                temp <<= 1;      // Doubling the value of temp
                multiple <<= 1;  // Doubling the value of multiple to keep track of how many times temp was doubled
            }

            dvd -= temp;     // Subtracting the largest multiple from dividend
            result += multiple;  // Adding the corresponding multiple to the result quotient
        }

        return isNegative ? -result : result;  // Returning the final quotient with appropriate sign
    }
}
