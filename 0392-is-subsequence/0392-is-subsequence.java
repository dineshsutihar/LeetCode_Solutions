class Solution {
    public static boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        int sptr=0;
        int tptr=0;

        while(tptr<t.length()){
            
            if(s.charAt(sptr)==t.charAt(tptr)){
                sptr++;
            }
            tptr++;
            
            if (sptr==s.length()) return true;   
        }
        return false;
    }
}