class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            
             if (map.containsKey(nums[i])) {
                // If value is already in the map, increment its count
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                // If value is not in the map, add it with an initial count of 1
                map.put(nums[i], 1);
            }
        }
        
        //res to store the value as we already know that there will be exact 2 values so 
        int[] res =new int[2];
        int i =0; 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() ==1 ) {
                // adding the values in the array 
                res[i]=entry.getKey(); 
                i++;
            }
        }
        
        return res;
    }
}

//key components to remember 
// value of nums are not in ascending order 
