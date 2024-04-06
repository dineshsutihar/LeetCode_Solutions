class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int extraOpen = 0; 
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                sb.append(ch);
                extraOpen++;
            }else if(ch==')'){
                if(extraOpen>0){
                    sb.append(ch);
                    extraOpen--;
                }else if(extraOpen ==0){
                    continue;
                }
            }
            else{
                sb.append(ch);
            }
        }
        
        //remove the extra opens
        n=sb.length();
        for(int i=n-1; i>=0; i--){
            if(extraOpen == 0){
                break;
            }
            char ch = sb.charAt(i);
            if(ch == '('){
                sb.deleteCharAt(i);
                extraOpen--;
            }
        }

        

        // Stack<Integer> stack = new Stack<>();
        //find indexes invalid parantheses 
        // for(int i=0; i<n; i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         stack.push(i);
        //     }else if(ch==')'){
        //         if(stack.isEmpty() || s.charAt(stack.peek())==')'){
        //             stack.push(i);
        //         }else if(!stack.isEmpty() || s.charAt(stack.peek())=='('){
        //             stack.pop();
        //         }
        //     }
        // }
        // // form the string by removing invalid indexes
        // for(int i =n-1;i>=0; i-- ){
        //     if(!stack.isEmpty() && stack.peek() == i ){
        //         stack.pop();
        //         continue;
        //     }
        //     sb.insert(0,s.charAt(i));
        // }
        return sb.toString();
    }
}