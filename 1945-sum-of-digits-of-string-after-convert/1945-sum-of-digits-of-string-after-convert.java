class Solution {

    public int getLucky(String s, int k) {
        // Convert each character to its numerical value and build a string
        String numericString = "";
        for (char ch : s.toCharArray()) {
            numericString += Integer.toString(ch - 'a' + 1);
        }

        // Apply digit sum transformations k times
        while (k-- > 0) {
            int digitSum = 0;
            for (char digit : numericString.toCharArray()) {
                digitSum += digit - '0';
            }
            numericString = Integer.toString(digitSum);
        }

        // Convert the final string to integer and return
        return Integer.parseInt(numericString);
    }
}