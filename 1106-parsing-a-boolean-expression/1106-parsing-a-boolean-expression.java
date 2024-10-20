class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>(); 
        int n = expression.length(); 
        for(int i =0; i<n; i++){
            char ch = expression.charAt(i); 
            if(ch == ')'){
                int valT = 0; 
                int valF = 0; 
                
                while(stack.peek()!='('){
                    char currVal = stack.pop(); 
                    if(currVal== 't'){
                        valT++; 
                    }else{
                        valF++; 
                    }
                }
                stack.pop(); 
                char op = stack.pop(); 
                char ans = evaluate(op, valT, valF); 
                stack.push(ans); 
                
            }else{
                if(ch!=','){
                    stack.push(ch);
                }
            }
        }
        return stack.peek() == 't'; 
    }
    public char evaluate(char op, int valT, int valF){
        if(op == '&'){
            return (valF>0)?'f':'t'; 
        }else if(op == '|'){
            return (valT>0)?'t':'f'; 
        }else{
            return (valT > 0) ? 'f' : 't';
        }
    }
}