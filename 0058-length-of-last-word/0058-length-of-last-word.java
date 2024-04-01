class Solution {
    public int lengthOfLastWord(String s) {
        String[] tokens = s.split(" ");
        int len = tokens.length;
        int lastWordLength = tokens[len-1].length();
        return lastWordLength ;
            
        
    }
}