class Solution {
    public int longestSquareStreak(int[] nums) {
        Map<Integer, Integer> streakLengths = new HashMap<>(); 
        
        Arrays.sort(nums); 
        
        for(int num: nums){
            int root = (int) Math.sqrt(num); 
            
            if(root*root == num && streakLengths.containsKey(root)){
                streakLengths.put(num, streakLengths.get(root)+1); 
            }
            else{
                streakLengths.put(num, 1); 
            }
        }
        
        int longestStreak =0; 
        for(int streakLength: streakLengths.values()){
            longestStreak = Math.max(longestStreak, streakLength); 
        }
        
        return longestStreak ==1 ? -1: longestStreak; 
    }
}