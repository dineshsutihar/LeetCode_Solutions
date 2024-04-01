class Solution {
    public int lengthOfLastWord(String s) {

        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') len++;
            else if (len != 0) break;
        }
        return len;
    

        //last approach 
        // String[] tokens = s.split(" ");
        // int len = tokens.length;
        // int lastWordLength = tokens[len-1].length();
        // return lastWordLength ;
        
       
        //Old Code
//         // Trim the input string to remove leading and trailing whitespaces
//         s = s.trim();

//         // Check if the string is empty after trimming
//         if (s.isEmpty()) {
//             return 0;
//         }

//         // Find the last space in the trimmed string
//         int lastSpaceIndex = s.lastIndexOf(' ');

//         // If there are no spaces, the entire string is the last word
//         if (lastSpaceIndex == -1) {
//             return s.length();
//         }

//         // Return the length of the last word
//         return s.length() - lastSpaceIndex - 1;

            
        
    }
}