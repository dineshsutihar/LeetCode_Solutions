class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(); 
        int j = 0; // Pointer to track the current position in the string `s`
        
        for (int i = 0; i < spaces.length; i++) {
            sb.append(s.substring(j, spaces[i]));
            sb.append(" ");
            j = spaces[i];
        }
    
        sb.append(s.substring(j));
        
        return sb.toString(); 
    }
}
