class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashMap<Character, Character> tToSMap = new HashMap<>();
        StringBuilder stS = new StringBuilder(s);
        StringBuilder stT = new StringBuilder(t);

        int n = s.length();
        for(int i =0; i<n;i++){
            char s1 = stS.charAt(i);
            char t1 = stT.charAt(i);
            if(!sToTMap.containsKey(s1)){
                sToTMap.put(s1,t1);
            }
            if(!tToSMap.containsKey(t1)){
                tToSMap.put(t1,s1);
            }
            if(sToTMap.get(s1)!=t1 || tToSMap.get(t1)!=s1){
                return false; 
            }
        }
        return true;

    }
}