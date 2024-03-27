class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0; 
        int len = nums.length;
        for(int i =0; i<len; i++){
            int product =  1; 
            for(int j=i; j<len; j++){
                // if(product>=k) break; 
                product*=nums[j];
                if(product<k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count; 
        
    }
}