class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Create an array of indices
        Integer[] indices = new Integer[names.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }
        
        // Sort indices based on the heights
        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]); // Sort in descending order
        
        // Create a new array for sorted names
        String[] sortedNames = new String[names.length];
        for (int i = 0; i < indices.length; i++) {
            sortedNames[i] = names[indices[i]];
        }
        
        return sortedNames;
    }
}