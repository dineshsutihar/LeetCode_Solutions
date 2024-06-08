// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         int len = nums.length; 
//         for(int i =0; i<len-1; i++){
//             int sum =nums[i]; 
//             for(int j=i+1;j<len; j++){
//                 sum+=nums[j];
//                 if((sum%k)==0) return true;
                
//             }
//         }
//         return false;
//     }
// } //Time limit exceed



class Solution {

    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixMod = 0;
        HashMap<Integer, Integer> modSeen = new HashMap<>();
        modSeen.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixMod = (prefixMod + nums[i]) % k;

            if (modSeen.containsKey(prefixMod)) {
                // ensures that the size of subarray is at least 2
                if (i - modSeen.get(prefixMod) > 1) {
                    return true;
                }
            } else {
                // mark the value of prefixMod with the current index.
                modSeen.put(prefixMod, i);
            }
        }

        return false;
    }
}
