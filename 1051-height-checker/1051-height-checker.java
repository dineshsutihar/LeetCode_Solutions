class Solution {
    public int heightChecker(int[] heights) {
        int leng = heights.length; 
        int[] oldArr = new int[leng];
        for(int i =0; i<leng; i++){
            oldArr[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0; 
        for(int i =0; i<leng; i++){
            if(heights[i]!=oldArr[i]){
                count++; 
            }
        }
        return count; 

    }
}