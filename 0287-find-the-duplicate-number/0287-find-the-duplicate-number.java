class Solution {
    public int findDuplicate(int[] nums) {
        // detect the common node; 
        int slow = 0 ; 
        int fast =0; 
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];

        }while(slow!=fast);
        fast =0;
        //lets find the start of ll
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}