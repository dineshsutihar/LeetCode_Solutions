class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        
        for(Integer i: nums){
            if(set.contains(i)){
                return true; 
            
            }
            set.add(i); 
        }
        
        return false; 
    }
}