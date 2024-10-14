import java.util.PriorityQueue;

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>((a, b) -> b - a);        

        for (int num : nums) {
            intQueue.add(num);
        }

        long score = 0; 

        while (k > 0) {
            int val = intQueue.remove(); 
            score += val;

            intQueue.add((int) Math.ceil(val / 3.0));  
            k--;
        }

        return score;
    }
}
