class Solution {
    public int removeElement(int[] nums, int val) {
        // Making another array to sotre the value 
        
        int k = 0;
        
        for( int i = 0; i< nums.length; i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
        

    }
}