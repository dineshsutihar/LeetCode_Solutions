class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start =0; 
        int end=0; 
        int maxLen=0; 
        int n= nums.length; 
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        while(end<n){
            //exp
            //include the element in the window 
            freqMap.put(nums[end],freqMap.getOrDefault(nums[end],0)+1);
            //if window is invalid, then shrink it
            while(freqMap.get(nums[end])>k){
                freqMap.put(nums[start],freqMap.get(nums[start])-1);
                start++;
            }
            maxLen = Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
    }
}