class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> val = new HashSet<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
       for(int num: nums1){
           val.add(num);
       }
        for(int num: nums2){
           if( val.contains(num)){
               return num;
           }
        }
        return -1;
    }
}