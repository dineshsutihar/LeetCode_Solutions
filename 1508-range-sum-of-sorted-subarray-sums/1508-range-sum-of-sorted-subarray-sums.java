class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int newArr[] = new int[n*(n+1)/2];
        int k =0; //for new array increment;
        // Define the modulo value
        final int MOD = 1000000007;
        
        //finding sub array 
        for(int i =0; i<n; i++){
            int sum =0; 
            for (int j = i; j < n; j++) {
                sum = sum+nums[j];
                newArr[k++]=sum; 
                // System.out.println(sum);
            }
            
        }
        Arrays.sort(newArr);
        int totalSum =0; 
        for(int i=left-1; i<right; i++){
            totalSum=(totalSum+ newArr[i])%MOD;
            // System.out.println("Total Sum: " + totalSum);

        }
        return totalSum; 
    }
}