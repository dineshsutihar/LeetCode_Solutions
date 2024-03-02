class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0 ; i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        
        for(int i =0 ; i<nums.length;i++){
            System.out.println(nums[i]);
        }
        Arrays.sort(nums);
        return nums; 
    }
}