class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openBrackets = new Stack<>();
        Stack<Integer> asterisks = new Stack<>();

        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                openBrackets.push(i);
            }else if(ch == '*'){
                asterisks.push(i);
            } else {
                
                
                if(!openBrackets.empty()){
                    openBrackets.pop();
                }else if(!asterisks.empty()){
                    asterisks.pop();
                }else {
                    return false; 
                }
            }
            
            
        }
        
        while(!openBrackets.isEmpty() && !asterisks.isEmpty()){
            if(openBrackets.pop() > asterisks.pop()){
                return false; 
            }
        }
        
        
        return openBrackets.isEmpty();
        
    }
}