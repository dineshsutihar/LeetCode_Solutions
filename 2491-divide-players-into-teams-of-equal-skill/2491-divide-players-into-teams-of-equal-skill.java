class Solution {
    public long dividePlayers(int[] skill) {
        
        int len = skill.length; 
        if(len ==2) return skill[0]*skill[1]; 

        Arrays.sort(skill); 
        
        int eachTeamSize = skill[0]+skill[len-1]; 
        long sum=skill[0]*skill[len-1]; 
        
        int i =1, j = len-2; 
        
        while(i<j){
            if((skill[i]+skill[j]) != eachTeamSize){
                return -1; 
            }
            sum = sum+(skill[i]*skill[j]); 
            
            i++; 
            j--; 
        }
        
        return sum; 
    }
}