class Solution {
    public int pivotInteger(int n) {
        
//         for(int i=1; i<=n; i++){
//             int sumLeft = 0; 
//             int sumRight = 0; 
            
//             for(int j = 1 ; j<=i; j++){
//                 sumLeft +=j; 
//             }
            
            
//             for(int k = i ; k<=n; k++){
//                 sumRight +=k; 
//             }
            
//             if(sumLeft == sumRight){
//                 return i; 
//             }
//         }
        
        
        //lets use two pointer method
        int sumLeft =1; 
        int sumRight =n;
        int leftValue =1; 
        int rightValue =n;
        
         if (n == 1) return n;
        
        
        while(leftValue<rightValue){
            if(sumLeft<sumRight){
                sumLeft += ++leftValue;
            } else{
               sumRight += --rightValue;
            }
            
            if(sumLeft == sumRight && leftValue + 1 == rightValue - 1){
                return leftValue + 1;
            }
        }
        
        return -1;
        
        
        
    }
}