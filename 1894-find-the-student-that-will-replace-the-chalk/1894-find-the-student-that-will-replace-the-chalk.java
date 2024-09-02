class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sum = 0; 
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
            if(sum > k){
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

        return -1; // This line will never be reached
    }
}
