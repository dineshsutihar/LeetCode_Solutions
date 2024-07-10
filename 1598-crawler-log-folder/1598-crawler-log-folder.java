class Solution {
    public int minOperations(String[] logs) {
        int currentStatus = 0; 
        int leng = logs.length; 
        
        for(String log: logs){
           if(log.charAt(log.length()-2)=='.' && log.length()>2 && log.charAt(log.length()-3)=='.' && currentStatus != 0){
               
                    currentStatus--;
           }
            if(log.charAt(log.length()-2)!='.'){
                currentStatus++;
            }
            
        }
        
        return currentStatus; 
    
    }
    
   
}

