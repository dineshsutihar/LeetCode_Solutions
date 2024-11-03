class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length(); 
        if(len!=goal.length()) return false; 
        
        return(s+s).contains(goal); 
    }
}