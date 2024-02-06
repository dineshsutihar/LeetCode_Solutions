class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";
        for(int i=left; i<=right; i++){
            String word = words[i];
            if(word.length() >0 && vowels.indexOf(word.charAt(0)) != -1 && vowels.indexOf(word.charAt(word.length() - 1))!=-1){
                count ++;
            }
        }
        return count;
    }
}