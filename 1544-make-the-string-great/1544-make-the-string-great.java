class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            int len = ans.length();
            if(len > 0 && Math.abs(ans.charAt(len-1)-ch)==32){
                ans.deleteCharAt(len-1);
            }
            else{
                ans.append(ch);
            }
        }
        
        return ans.toString();
        
    }
}