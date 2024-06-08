// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         int len = nums.length; 
//         for(int i =0; i<len-1; i++){
//             int sum =nums[i]; 
//             for(int j=i+1;j<len; j++){
//                 sum+=nums[j];
//                 if((sum%k)==0) return true;
                
//             }
//         }
//         return false;
//     }
// } //Time limit exceed



class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map to store the remainder of the cumulative sum and the corresponding index
        Map<Integer, Integer> remainderMap = new HashMap<>();
        // Initialize with remainder 0 at index -1 to handle the case where the subarray starts from the beginning
        remainderMap.put(0, -1);
        
        int cumulativeSum = 0;

        for (int i = 0; i < nums.length; i++) {
            cumulativeSum += nums[i];
            int remainder = cumulativeSum % k;
            
            // Normalize the remainder to be positive
            if (remainder < 0) {
                remainder += k;
            }

            if (remainderMap.containsKey(remainder)) {
                // Check if the length of the subarray is at least 2
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Store the first occurrence of this remainder
                remainderMap.put(remainder, i);
            }
        }

        return false;
    }
}
