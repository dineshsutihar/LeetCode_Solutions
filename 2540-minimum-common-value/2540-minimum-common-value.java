class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        //Orignal Approach i have used 
        
       //  Set<Integer> val = new HashSet<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
       // for(int num: nums1){
       //     val.add(num);
       // }
       //  for(int num: nums2){
       //     if( val.contains(num)){
       //         return num;
       //     }
       //  }
       //  return -1;
        
        //alternating approach using 2 pointer approach 
        
        int i =0, j=0;
        
        while(i<len1 && j<len2){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }else if(nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }
            
        }
        return -1;
        
    }
}