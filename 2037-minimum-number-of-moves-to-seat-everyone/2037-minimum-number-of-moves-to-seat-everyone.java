class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        //try sorting both array then try to to compare greater with greater and smaller with saller
        Arrays.sort(seats);
        Arrays.sort(students);
        
        int size = seats.length;
        
        int totalMove = Math.abs(seats[0]-students[0]);
        for(int i =1; i<size; i++){
            // if(seats[i]==students[i]){
            //     totalMove= totalMove +0; 
            // }
            
            totalMove += Math.abs(seats[i]-students[i]);
        }
        return totalMove;
    }
}