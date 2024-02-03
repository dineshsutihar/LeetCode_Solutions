import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
//         Stack<String> stack = new Stack<>();

//         // converting the given string into array 
//         char[] charArray = s.toCharArray();

//         boolean result = true; // Initialize with a default value

//         if (charArray[0] == '}' || charArray[0] == ']' || charArray[0] == ')') {
//             return false;
//         }

//         for (char c : charArray) {
//             String currentChar = String.valueOf(c);

//             if (currentChar.equals("{") || currentChar.equals("[") || currentChar.equals("(")) {
//                 stack.push(currentChar);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;  // Stack is empty, but closing bracket encountered
//                 }

//                 String popped = stack.pop();

//                 switch (currentChar) {
//                     case "}":
//                         if (!popped.equals("{")) {
//                             return false;
//                         }
//                         break;
//                     case "]":
//                         if (!popped.equals("[")) {
//                             return false;
//                         }
//                         break;
//                     case ")":
//                         if (!popped.equals("(")) {
//                             return false;
//                         }
//                         break;
//                 }
//             }
//         }

//         // Check if the stack is empty at the end
//         return stack.isEmpty() && result;
        
        Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();

    }
}
