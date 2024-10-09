// class Solution {
//     public int minAddToMakeValid(String s) {
//         Stack<Character> stack = new Stack<>(); 
//         for(int i =0; i<s.length(); i++){
//             if(stack.isEmpty()){
//                 stack.push(s.charAt(i)); 
//             }
//             else if(s.charAt(i)==')' && stack.peek()=='('){
//                 stack.pop(); 
//             }
//             else{
//                 stack.push(s.charAt(i)); 
//             }
//         }
        
//         return stack.size(); 
//     }
// }


class Solution{
    public int minAddToMakeValid(String s){
        int openBrack = 0; 
        int minRequired = 0; 
        
        for(char c: s.toCharArray()){
            if(c == '('){
                openBrack++; 
            }else {
                if(openBrack >0){
                    openBrack--; 
                }else{
                    minRequired++; 
                }
            }
        }
        return minRequired + openBrack; 
    }
}