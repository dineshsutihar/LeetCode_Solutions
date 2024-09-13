class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        
        int[] prefixXOR = new int[n+1];
        for (int i = 0; i < n; i++) {
            prefixXOR[i+1] = prefixXOR[i] ^ arr[i];
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int leftIndex = queries[i][0];
            int rightIndex = queries[i][1];
            
            // XOR from arr[leftIndex] to arr[rightIndex]
            result[i] = prefixXOR[rightIndex + 1] ^ prefixXOR[leftIndex];
        }
        
        return result;
    }
}
