class Solution {

    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean primeSubOperation(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
        }

        // Store the previousPrime array.
        int[] previousPrime = new int[maxElement + 1];
        for (int i = 2; i <= maxElement; i++) {
            if (isPrime(i)) {
                previousPrime[i] = i;
            } else {
                previousPrime[i] = previousPrime[i - 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int bound;
            if (i == 0) {
                bound = nums[0];
            } else {
                bound = nums[i] - nums[i - 1];
            }
            if (bound <= 0) {
                return false;
            }

            int largestPrime = previousPrime[bound - 1];

            // Subtract this value from nums[i].
            nums[i] -= largestPrime;
        }
        return true;
    }
}