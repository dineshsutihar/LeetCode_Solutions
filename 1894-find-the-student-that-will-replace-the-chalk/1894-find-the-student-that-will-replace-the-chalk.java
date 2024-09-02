class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sum = 0; 
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
            if(sum > k){ // this was causing issue in long testcase
                break; 
            }
        }

        k = k % sum; 

        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }

        return -1; 
    }
}
