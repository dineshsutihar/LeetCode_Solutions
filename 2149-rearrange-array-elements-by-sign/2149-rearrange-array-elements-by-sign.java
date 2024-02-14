class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int pos[] = new int[nums.length/2];        
        int neg[] = new int[nums.length/2];
        
        int i = 0,j=0;
        for(int num:nums){
            if(num>=1){
                pos[i]=num;
                i++;
            }else{
                neg[j]=num;
                j++;
            }
        }
        
        nums[0] = pos[0];
        int k=1;
        j=0;
        for( i=1; i<nums.length; i++){
            if(i%2==0){
                nums[i]=pos[k];
                    k++;
            }else{
                nums[i]=neg[j];
                j++;
            }
        }
        

        return nums;
    }
}