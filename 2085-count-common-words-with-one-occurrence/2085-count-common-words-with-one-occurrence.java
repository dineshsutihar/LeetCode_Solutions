class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> countMap1 = new HashMap<>();
        HashMap<String, Integer> countMap2 = new HashMap<>();
        
        // Count words in words1
        for (String word : words1) {
            countMap1.put(word, countMap1.getOrDefault(word, 0) + 1);
        }
        
        // Count words in words2
        for (String word : words2) {
            countMap2.put(word, countMap2.getOrDefault(word, 0) + 1);
        }
        
        // Count words that appear exactly once in each array
        int count = 0;
        for (String word : countMap1.keySet()) {
            if (countMap1.get(word) == 1 && countMap2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }
        
        return count;
    }
}