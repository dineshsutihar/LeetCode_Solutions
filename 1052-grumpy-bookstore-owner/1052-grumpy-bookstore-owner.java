class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0; 
        int window = 0, max_window = 0;
        int satisfied =0 ; 
        for(int r=0; r<customers.length; r++){
            if(grumpy[r]>0){
                window += customers[r];
            }
            else{
                satisfied += customers[r];
            }
            if(r-left+1>minutes){
                if(grumpy[left]>0){
                window -= customers[left];
                }
                left+=1;
            }
            max_window = Math.max(window, max_window);
        }
        return satisfied + max_window; 
    }
}