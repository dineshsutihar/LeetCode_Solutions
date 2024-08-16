class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size()-1);
        int maxDistance = 0; 
        
        for(int i = 1; i < arrays.size(); i++){
            int currMax = arrays.get(i).get(arrays.get(i).size()-1);
            int currMin = arrays.get(i).get(0);
            
            //calculating the possible max distance 
            maxDistance = Math.max(maxDistance, Math.abs(currMax - minVal));
            maxDistance = Math.max(maxDistance, Math.abs(maxVal - currMin));
            
            minVal = Math.min(minVal, currMin);
            maxVal = Math.max(maxVal, currMax);
        }
        
        return maxDistance; 
    }
}