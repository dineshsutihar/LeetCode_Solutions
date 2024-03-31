class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minI = -1;
        int maxI = -1;
        long ans = 0; 
        int leftBoundary = -1;  
        int n= nums.length; 
        for(int current =0;current<n; current++){
            if(nums[current]==minK){
                minI=current;
            }
            if(nums[current]==maxK){
                maxI=current;
            }
            //check if element is out of bound
            if(nums[current]<minK || nums[current]>maxK){
                leftBoundary=current;
            }
            if(minI!=-1 && maxI!=-1){
                int smaller = Math.min(minI,maxI);
                if((smaller-leftBoundary)>0){
                    ans = ans + (smaller-leftBoundary);
                }
            }
        }
        return ans;
    }
}