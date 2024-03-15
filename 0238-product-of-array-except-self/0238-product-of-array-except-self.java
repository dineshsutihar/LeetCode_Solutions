// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int len = nums.length;
//         int[] answer = new int[len];
        
//         for(int i=0; i<len; i++){
//             int product =1; 
//             for(int j=0; j<len; j++){
//                 if(j!=i){
//                     product *=nums[j];
//                 }
//             }
//             answer[i]=product;
//         }
//         return answer;
//     }
// }



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        
        // Calculate the product of all elements to the left of each element
        int[] leftProducts = new int[len];
        leftProducts[0] = 1;
        for (int i = 1; i < len; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // Calculate the product of all elements to the right of each element
        int[] rightProducts = new int[len];
        rightProducts[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        // Multiply the left and right products to get the final answer
        for (int i = 0; i < len; i++) {
            answer[i] = leftProducts[i] * rightProducts[i];
        }
        
        return answer;
    }
}
