class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>(); 
        int count = 0; 
        for(int i =0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        
        for(String word: words){
            boolean isTrue = false; 
            for(char character: word.toCharArray()){
                if(set.contains(character) != true){
                    isTrue =false; 
                    break; 
                }
                isTrue = true; 
            }
            if(isTrue) count++; 
        }
        return count; 
    }
}