class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k); // Initialize the min-heap with a maximum size of k

        for (int num : nums) {
            add(num); // Add elements to the heap
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val); // Add to the heap if size is less than k
        } else if (val > minHeap.peek()) {
            minHeap.poll(); // Remove the smallest element
            minHeap.offer(val); // Add the new element
        }

        return minHeap.peek(); // The root of the heap is the k-th largest element
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
