class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(); 
        int m = s2.length(); 
        if(m<n) return false; 
        int[] map = new int[26];
        int[] map1 = new int[26]; 

        for(int i =0; i<n; i++){
            map[s1.charAt(i) -'a']++; 
            map1[s2.charAt(i) -'a']++; 

        }
//         initial case
        if(isMatched(map, map1)){
                return true; 
        }
        
        for(int i =1; i<=m-n; i++){
            map1[s2.charAt(i-1)-'a']--; 
            map1[s2.charAt(i+n-1)-'a']++; 

            if(isMatched(map, map1)){
                return true; 
            }
        }
        return false; 
        
    }
    private boolean isMatched(int map[], int map1[]){
        for(int i =0; i<26; i++){
            if(map[i]!=map1[i]) return false; 
        }
        return true; 
    }
}