class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        int len = word.length(); 
        if(index == -1){
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(index+1,len));
        System.out.println(sb);
        for(int i = 0; i <= index; i++){
            sb.insert(0, word.charAt(i));
        }
        return sb.toString();
    }
}
