// class Solution {
//     public int findNumbers(int[] nums) {
//         int len = nums.length; 
//         int countval=0;
//         for(int i =0; i<len; i++){
//             if(isEvenDegit(nums[i])){
//                 countval++;
//             }
//         }
//         return countval; 
//     }
//     static boolean isEvenDegit(int num){
//         int count = 0; 
//         while(num>0){
//             num=num/10;
//             count++;
//         }
//         if(count%2==0){
//             return true; 
//         }
//         else return false; 
//     }
// }

class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length; 
        int countval=0;
        for(int i =0; i<len; i++){
            if((int)(Math.log10(nums[i])+1)%2==0){
                countval++;
            }
        }
        return countval; 
    }

}