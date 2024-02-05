class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int len = s.length();
        char[] charArray = s.toCharArray();

        int start = 0;
        int end = len - 1;

        while (start < end) {
            // Find the next vowel from the start
            while (start < end && vowels.indexOf(charArray[start]) == -1) {
                start++;
            }

            // Find the next vowel from the end
            while (start < end && vowels.indexOf(charArray[end]) == -1) {
                end--;
            }

            // Swap the vowels
            if (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                // Move the pointers
                start++;
                end--;
            }
        }

        return new String(charArray);
    }
}
