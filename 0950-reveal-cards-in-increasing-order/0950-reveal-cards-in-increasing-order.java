class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        
        Queue<Integer> que = new LinkedList<>();
        
        // adding elements in queue
        for(int i =0; i<n; i++){
            que.add(i);
        }
        
        Arrays.sort(deck);
        
        //put cards at correct index in result
        int[] result = new int[n];
        
        for(int i=0; i<n;i++){
            //reveal card and place in result
            result[que.poll()]=deck[i];
            
            que.add(que.poll());
        }
        return result; 
    }
}