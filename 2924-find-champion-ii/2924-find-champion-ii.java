class Solution {
    public int findChampion(int n, int[][] edges) {
        int countArr[] = new int[n]; 
        Arrays.fill(countArr, 0); 

        for(int i =0; i<edges.length; i++){
            int dest = edges[i][1];
            countArr[dest]+=1; 
        }

        int result =-1; 

        for(int i =0; i<countArr.length; i++){
            if (countArr[i] == 0) {
                if (result != -1) {
                    return -1; // Multiple zeros found
                }
                result = i;
            }
        }
        return result; 
    } 
}