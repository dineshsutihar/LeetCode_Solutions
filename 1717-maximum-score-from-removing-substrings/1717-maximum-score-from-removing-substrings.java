// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         int maxPoint = 0; 
//         StringBuilder sb = new StringBuilder(s);
        
//         String firstCheck = "ab";
//         String secondCheck="ba"; 
//         int max = Math.max(x,y);
//         int min = Math.min(x,y);
        
//         if(y>x){
//             firstCheck = "ba";
//             secondCheck = "ab";
//         }
        
//         while(true){
//             int firstIndex = sb.indexOf(firstCheck); 
//             int secondIndex = sb.indexOf(secondCheck);
            
//             if(firstIndex ==-1 && secondIndex ==-1){
//                 return maxPoint; 
//             }
//             else if(firstIndex!= -1){
//                 sb.delete(firstIndex,firstIndex+2);
//                 maxPoint += max; 

                
//             }else if( secondIndex != -1){
//                 sb.delete(secondIndex, secondIndex+2);
//                 maxPoint +=min;    
//             }
//         }
//     }
// } TLE

class Solution {
    public int maximumGain(String s, int x, int y) {
        int maxPoint = 0;
        Stack<Character> stack = new Stack<>();
        int max, min;
        char firstChar, secondChar;

        if (y > x) {
            max = y;
            min = x;
            firstChar = 'b';
            secondChar = 'a';
        } else {
            max = x;
            min = y;
            firstChar = 'a';
            secondChar = 'b';
        }

        // First pass to handle the max valued substring
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == firstChar && ch == secondChar) {
                stack.pop();
                maxPoint += max;
            } else {
                stack.push(ch);
            }
        }

        // Prepare for the second pass
        Stack<Character> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        // Second pass to handle the min valued substring
        while (!tempStack.isEmpty()) {
            char ch = tempStack.pop();
            if (!stack.isEmpty() && stack.peek() == secondChar && ch == firstChar) {
                stack.pop();
                maxPoint += min;
            } else {
                stack.push(ch);
            }
        }

        return maxPoint;
    }
}


