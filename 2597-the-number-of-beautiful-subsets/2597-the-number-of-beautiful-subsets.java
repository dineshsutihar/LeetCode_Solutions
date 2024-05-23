class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        int totalCount = 1;
        Map<Integer, Map<Integer, Integer>> freqMap = new TreeMap<>();

        // Calculate frequencies based on remainder
        for (int num : nums) {
            Map<Integer, Integer> fr = freqMap.getOrDefault(num % k, new TreeMap<>());
            fr.put(num, fr.getOrDefault(num, 0) + 1);
            freqMap.put(num % k, fr);
        }

        // Iterate through each remainder group
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : freqMap.entrySet()) {
            int prevNum = -k, prev2 = 0, prev1 = 1, curr = 1;

            // Iterate through each number in the current remainder group
            for (Map.Entry<Integer, Integer> freqEntry : entry.getValue().entrySet()) {
                int num = freqEntry.getKey();
                int freq = freqEntry.getValue();
                // Count of subsets skipping the current number
                int skip = prev1; 

                // Count of subsets including the current number
                // Check if the current number and the previous number 
                // form a beautiful pair
                int take;
                if (num - prevNum == k) {
                    take = ((1 << freq) - 1) * prev2;
                } else {
                    take = ((1 << freq) - 1) * prev1;
                }

                curr = skip + take; // Store the total count for the current number
                prev2 = prev1;
                prev1 = curr;
                prevNum = num;
            }
            totalCount *= curr;
        }
        return totalCount - 1;
    }
}