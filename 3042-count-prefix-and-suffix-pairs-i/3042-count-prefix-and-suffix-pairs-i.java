class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0; 
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j]) && i < j) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public boolean isPrefixAndSuffix(String prefix, String str) {
        return str.startsWith(prefix) && str.endsWith(prefix);
    }
}
