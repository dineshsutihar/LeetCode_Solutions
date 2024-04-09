class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int len = tickets.length;
        int time = 0;
        
        for(int i=0; i<len;i++){
            if(i<=k){
                time = time + Math.min(tickets[k],tickets[i]);
            }
            //i is greater than k
            else{
                time = time + Math.min(tickets[k]-1,tickets[i]);

            }
        }
        
        //Old Code
        
        // //iterating over tickets
        // while(tickets[k]>0){
        //     for(int i=0; i<len; i++){
        //         if(tickets[i]>0 && tickets[k]>0){
        //             tickets[i]=tickets[i]-1;
        //             time++;
        //         }
        //     }
        // }
        
        return time;
        
    }
}