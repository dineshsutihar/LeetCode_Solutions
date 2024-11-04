class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder(); 
        int count = 1; 
        if(word.length() ==1) return "1"+word; 
        
        for(int i =1; i<word.length(); i++){
            if(count==9 && word.charAt(i) == word.charAt(i - 1)){
                comp.append(count).append(word.charAt(i-1)); 
                count=0; 
            }
            
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                comp.append(count).append(word.charAt(i - 1));
                count = 1;
            }
            
            if (i == word.length() - 1) {
                comp.append(count).append(word.charAt(i));
            }
        }
        
        return comp.toString(); 
    }
}