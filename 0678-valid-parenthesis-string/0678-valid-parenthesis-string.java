class Solution {
    public boolean checkValidString(String s) {
        //using 2 pointer Approach 
        
        int openCount = 0, closeCount = 0, len = s.length()-1;
        
        for(int i =0; i<=len; i++){
            
            //Counting the open braces and astrics 
            char ch = s.charAt(i);
            if(ch == '(' || ch == '*'){
                openCount++;
            }else {
                openCount--;
            }
            
            //Counting closing braces 
            char ech = s.charAt(len-i);
            if(ech == ')' || ech == '*'){
                closeCount++;
            }else {
                closeCount--;
            }
            
            
            //if at any point open and close count goes negative, then the string is invalid
            if(closeCount<0 || openCount <0){
                return false; 
            }
        }
        
        return true;
        
        
        
        
        
        //Using 2 Stack Approach 
//         Stack<Integer> openBrackets = new Stack<>();
//         Stack<Integer> asterisks = new Stack<>();

//         int n = s.length();
//         for(int i=0; i<n; i++){
//             char ch = s.charAt(i);
//             if(ch == '('){
//                 openBrackets.push(i);
//             }else if(ch == '*'){
//                 asterisks.push(i);
//             } else {
                
                
//                 if(!openBrackets.empty()){
//                     openBrackets.pop();
//                 }else if(!asterisks.empty()){
//                     asterisks.pop();
//                 }else {
//                     return false; 
//                 }
//             }
            
            
//         }
        
//         while(!openBrackets.isEmpty() && !asterisks.isEmpty()){
//             if(openBrackets.pop() > asterisks.pop()){
//                 return false; 
//             }
//         }
        
        
//         return openBrackets.isEmpty();
        
    }
}