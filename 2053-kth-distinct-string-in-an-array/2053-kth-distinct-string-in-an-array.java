class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> newArr = new ArrayList<>();
        
        for(String str: arr){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        
        for(String str: arr){
            if(map.get(str) == 1) newArr.add(str);
        }
        
        if(newArr.size()<k) return "";
        
        return newArr.get(k-1);
        
    }
}