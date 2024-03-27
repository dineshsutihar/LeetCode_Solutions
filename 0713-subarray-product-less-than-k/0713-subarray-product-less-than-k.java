class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        
        //BruteForce method => O(n^2)
        // int count = 0; 
        // int len = nums.length;
        // for(int i =0; i<len; i++){
        //     int product =  1; 
        //     for(int j=i; j<len; j++){
        //         // if(product>=k) break; 
        //         product*=nums[j];
        //         if(product<k){
        //             count++;
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return count; 
        
        //Sliding window technique => O(n)
        
        if(k<=1){
            return 0;
        }
        int n = nums.length;
        int start =0; 
        int end = 0; 
        int prod =1 ;
        int count = 0;
        while(end<n){
            //expansion phase 
            prod = prod*nums[end];
            //shringking
            while(prod>=k){
                prod = prod/nums[start];
                start++;
            }
            count = count +(end-start+1);
            end++;
        }
        return count;
        
    }
}