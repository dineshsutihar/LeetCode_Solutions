class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        // int[] colArr = new int[matrix.length];
        // int[] rowArr = new int[matrix[0].length];
        Set<Integer> element = new HashSet<>();
        
        int incre =0; 
        //Calculate row and Columns
        for(int[] row: matrix){
            int rowCurrent = Integer.MAX_VALUE; 
            for(int val: row){
                rowCurrent = Math.min(rowCurrent,val); 
            }
            // rowArr[incre++]=rowCurrent;
            element.add(rowCurrent);
        }
        
        // Finding all Max Value in Col
        incre =0; 
        for(int i =0; i<matrix[0].length; i++ ){
            int colCurrent = Integer.MIN_VALUE; 
            for(int j=0; j<matrix.length;j++){
                colCurrent = Math.max(colCurrent,matrix[j][i]); 
            }
            // colArr[incre++]=colCurrent;
            if(element.contains(colCurrent)){
                result.add(colCurrent);
            }
        }
        //Row Col both done now its time for finding the Common on Both; 
        
        
        return result; 
    }
}