class Solution {
    public int firstMissingPositive(int[] nums) {
        //data filtering 
        int n = nums.length; 
        for(int i =0; i<n; i++){
            if(nums[i]<=0 || nums[i]>=(n+1)){
                nums[i] = n+1;
            }
        }
        //mark visited 
         for(int i =0; i<n; i++){
            int element = Math.abs(nums[i]);
             if(element == n+1){
                 continue; 
             }
             int seat = element -1;
             if(nums[seat]>0){
                 nums[seat] = -nums[seat];
             }
        }
        
        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}