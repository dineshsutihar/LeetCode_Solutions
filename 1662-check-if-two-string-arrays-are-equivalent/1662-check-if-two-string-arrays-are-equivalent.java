class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sb = Arrays.toString(word1).replace("[","").replace("]","").replace(", ","");
        String sb1 = Arrays.toString(word2).replace("[","").replace("]","").replace(", ","");
        return sb.equals(sb1);
    }
}