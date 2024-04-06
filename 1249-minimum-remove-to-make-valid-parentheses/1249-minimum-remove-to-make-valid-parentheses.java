class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        int n = s.length();
        //find indexes invalid parantheses 
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else if(ch==')'){
                if(stack.isEmpty() || s.charAt(stack.peek())==')'){
                    stack.push(i);
                }else if(!stack.isEmpty() || s.charAt(stack.peek())=='('){
                    stack.pop();
                }
            }
        }
        // form the string by removing invalid indexes
        StringBuilder sb = new StringBuilder();
        for(int i =n-1;i>=0; i-- ){
            if(!stack.isEmpty() && stack.peek() == i ){
                stack.pop();
                continue;
            }
            sb.insert(0,s.charAt(i));
        }
        return sb.toString();
    }
}