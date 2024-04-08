class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length, circleStudentCount =0, squareStudentCount=0;
        
        //Count the no. of circle and square sandwich 
        for(int i=0; i<len; i++){
            if(students[i]==0){
                circleStudentCount++;
            }else{
                squareStudentCount++;
            }
        }
        
        //removing the elements form sandqiches
        // Serve sandwiches to students
        for (int sandwich : sandwiches) {
            // No student wants the circle sandwich on top of the stack
            if (sandwich == 0 && circleStudentCount == 0) {
                return squareStudentCount;
            }
            // No student wants the square sandwich on top of the stack
            if (sandwich == 1 && squareStudentCount == 0) {
                return circleStudentCount;
            }
            // Decrement the count of the served sandwich type
            if (sandwich == 0) {
                circleStudentCount--;
            } else {
                squareStudentCount--;
            }
        }
        
        return 0;
        
    }
}