class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        // declare a variable to store buildings crossed
        int buildCrossed = 0;
        
        // use a priority queue to keep track of the difference between building heights
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        // iterate through the height of buildings
        for (int i = 0; i < heights.length - 1; i++) {
            
            int diff = heights[i + 1] - heights[i];
            
            if (diff > 0) {
                // if the difference is positive, it means there is a climb
                priorityQueue.add(diff);
                
                // if the size of the priority queue exceeds the number of available ladders
                // use bricks to cover the smallest climb
                if (priorityQueue.size() > ladders) {
                    bricks -= priorityQueue.poll();
                }
                
                // if bricks become negative, return the current number of buildings crossed
                if (bricks < 0) {
                    return buildCrossed;
                }
            }
            
            // increment the count of buildings crossed
            buildCrossed++;
        }
        
        return buildCrossed;
    }
}
