class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<num.length(); i++){
            char ch = num.charAt(i);
            //remove form the left
            while(!stack.isEmpty() && k>0 && ch<stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        //remove k elements from the right side
    //convert stack to string builder
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            if(k>0){
                stack.pop();
                k--;
            }else{
            sb.insert(0,stack.pop());
            }
        }
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return (sb.length()==0)?"0":sb.toString();
    }
}