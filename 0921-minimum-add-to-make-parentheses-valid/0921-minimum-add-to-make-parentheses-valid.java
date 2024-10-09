class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>(); 
        for(int i =0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i)); 
            }
            else if(s.charAt(i)==')' && stack.peek()=='('){
                stack.pop(); 
            }
            else{
                stack.push(s.charAt(i)); 
            }
        }
        
        return stack.size(); 
    }
}