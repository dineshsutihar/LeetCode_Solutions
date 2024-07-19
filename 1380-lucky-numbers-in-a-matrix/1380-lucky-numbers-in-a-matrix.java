class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> element = new HashSet<>();
        
        int incre =0; 
        for(int[] row: matrix){
            int rowCurrent = Integer.MAX_VALUE; 
            for(int val: row){
                rowCurrent = Math.min(rowCurrent,val); 
            }
            element.add(rowCurrent);
        }
        
        incre =0; 
        for(int i =0; i<matrix[0].length; i++ ){
            int colCurrent = Integer.MIN_VALUE; 
            for(int j=0; j<matrix.length;j++){
                colCurrent = Math.max(colCurrent,matrix[j][i]); 
            }
            if(element.contains(colCurrent)){
                result.add(colCurrent);
            }
        }
        return result; 
    }
}