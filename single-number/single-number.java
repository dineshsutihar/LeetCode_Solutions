class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        for(Integer i: nums){
            if(set.contains(i)) set.remove(i); 
            else set.add(i); 
        }
               
        Iterator<Integer> itr = set.iterator(); 
        
        return itr.next(); 
         
    }
}