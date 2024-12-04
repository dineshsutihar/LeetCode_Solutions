class Solution {

    public boolean canMakeSubsequence(String str1, String str2) {
        int str2Index = 0;
        int lengthStr1 = str1.length(), lengthStr2 = str2.length();

        for (
            int str1Index = 0;
            str1Index < lengthStr1 && str2Index < lengthStr2;
            ++str1Index
        ) {
            if (
                str1.charAt(str1Index) == str2.charAt(str2Index) ||
                (str1.charAt(str1Index) + 1 == str2.charAt(str2Index)) ||
                (str1.charAt(str1Index) - 25 == str2.charAt(str2Index))
            ) {
                // If match found, move to next character in str2
                str2Index++;
            }
        }
        // Check if all characters in str2 were matched
        return str2Index == lengthStr2;
    }
}