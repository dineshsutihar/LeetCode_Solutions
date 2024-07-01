class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int countOfOdd = 0; 
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2!=0 && countOfOdd!=3){
                countOfOdd++; 

            } else if(arr[i]%2==0){
                countOfOdd=0;
            }
            if(countOfOdd >=3){
                return true; 
            }
        }

        return false; 
    }
}