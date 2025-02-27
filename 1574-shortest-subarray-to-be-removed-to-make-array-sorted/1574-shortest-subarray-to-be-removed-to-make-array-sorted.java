class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {       
        int n = arr.length;
        int left = 0, right = n - 1;
        
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }
        
        if (right == 0) return 0;
        
        int ans = right;
        
        while (left < right && (left == 0 || arr[left - 1] <= arr[left])) {
            while (right < n && arr[left] > arr[right]) {
                right++;
            }
            ans = Math.min(ans, right - left - 1);
            left++;
        }
        
        return ans;
    }
}