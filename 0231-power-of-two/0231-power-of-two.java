class Solution {
    public boolean isPowerOfTwo(int n) {
        
        //here we are checking weather the number is greater than 0 and binary AND operation on n & n-1 which always return 0
        return n>0 && (n&(n-1)) ==0;
    }
}