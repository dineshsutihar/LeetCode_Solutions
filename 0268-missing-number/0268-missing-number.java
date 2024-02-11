class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length +1;
        int[] numss = new int[len];
        System.arraycopy(nums,0,numss,0,len-1);
        
        for(int i=0; i<len; i++){
            if(i!=numss[i] ){
                return i;
            }
        }
        return -1;
    }
}