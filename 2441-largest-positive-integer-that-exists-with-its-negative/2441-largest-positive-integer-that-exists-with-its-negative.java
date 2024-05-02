class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int max =-1; 
        for(int element: nums){
            if(Math.abs(element)>max){
                if(seen.contains(-element)){
                    max=Math.abs(element);
                }else{
                    seen.add(element);
                }
            }
        }
        return max;
    }
}