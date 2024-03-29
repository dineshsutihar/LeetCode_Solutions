class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length; 
        //max element 
        int maxElement = Integer.MIN_VALUE; 
        for(int i = 0; i<n; i++){
            maxElement = Math.max(maxElement,nums[i]);
        }
        int start = 0; 
        int end = 0; 
        long count =0;
        int maxElementFreqCount=0; 
        while(end<n){
            //exp 
            if(nums[end]==maxElement){
                maxElementFreqCount++;
            }
            //shringkin
            while(maxElementFreqCount==k){
                count = count + (n-end);
                if(nums[start]==maxElement){
                    maxElementFreqCount--;
                }
                start++;
            }
            end ++;
        }
        return count;
    }
}