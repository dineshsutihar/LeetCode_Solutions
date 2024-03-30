class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countOfsubarrayWithAtMostk(nums,k)-        countOfsubarrayWithAtMostk(nums,k-1);

    }
    public int countOfsubarrayWithAtMostk(int[] nums,int k){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int start = 0; 
        int end = 0; 
        int count = 0; 
        int n = nums.length; 
        while(end<n){
            //exp
            freqMap.put(nums[end],freqMap.getOrDefault(nums[end],0)+1);
            //shrinking (at most k elements are supported)
            while(freqMap.size()>k){
                freqMap.put(nums[start],freqMap.get(nums[start])-1);
                if(freqMap.get(nums[start])==0){
                    freqMap.remove(nums[start]);
                }
                start++;
            }
            count = count + (end-start +1);
            end++;
        }
        return count; 
    }
}