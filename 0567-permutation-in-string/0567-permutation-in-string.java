class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(); 
        int m = s2.length(); 
        if(m<n) return false; 
        int[] map = new int[26];

        for(int i =0; i<n; i++){
            map[s1.charAt(i) -'a']++; 
        }
        for(int i =0; i<=m-n; i++){
            int[] map1 = new int[26]; 

            for(int j =0; j<n; j++){
                map1[s2.charAt(i+j) -'a']++; 
            }
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