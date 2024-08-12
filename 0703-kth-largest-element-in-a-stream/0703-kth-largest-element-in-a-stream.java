class KthLargest {
    ArrayList<Integer> nums = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {
        // Add elements from the array to the list
        for (int num : nums) {
            this.nums.add(num);
        }
        Collections.sort(this.nums);
        this.k = k;
    }
    
    public int add(int val) {
        int index = Collections.binarySearch(nums, val);
        if (index < 0) index = -index - 1; 
        nums.add(index, val);
        
        return nums.get(nums.size() - k);
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */