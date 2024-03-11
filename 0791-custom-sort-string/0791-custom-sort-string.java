class Solution {
    public String customSortString(String order, String s) {
        
        HashMap<Character,Integer> freqMap = new HashMap<>();
        
        //find the freq of chars in s 
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
            
        }
        
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<order.length(); i++){
            char ch1 = order.charAt(i);
            if(freqMap.containsKey(ch1)){
                int freq = freqMap.get(ch1);
                
                while(freq>0){
                    res.append(ch1);
                    freq--;
                }
                freqMap.remove(ch1);
            }
        }
        
        for(Map.Entry<Character,Integer> entry: freqMap.entrySet()){
            int freq1 = entry.getValue();
            char ch2 = entry.getKey();
            while(freq1>0){
                res.append(ch2);
                freq1--;
            }
        }
        return (res.toString());
    }
}