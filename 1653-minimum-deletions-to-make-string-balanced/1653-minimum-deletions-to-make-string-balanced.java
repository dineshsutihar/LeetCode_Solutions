class Solution {
    public int minimumDeletions(String s) {
        int count =0, result =0; 
        for(char c: s.toCharArray()){
            if(c == 'b') 
                count++; 
            else if(count !=0){
                result++; 
                count--; 
            }
            
        }
        return result; 
    }
}