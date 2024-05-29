class Solution {
    public int numSteps(String s) {
        int steps = 0;
        StringBuilder sb = new StringBuilder(s);
        
        while (sb.length() > 1) {
            steps++;
            if (sb.charAt(sb.length() - 1) == '0') {
                // Even number: remove the last character (divide by 2)
                sb.deleteCharAt(sb.length() - 1);
            } else {
                // Odd number: add 1 to the binary number
                int carry = 1;
                for (int i = sb.length() - 1; i >= 0; i--) {
                    if (sb.charAt(i) == '0') {
                        sb.setCharAt(i, '1');
                        carry = 0;
                        break;
                    } else {
                        sb.setCharAt(i, '0');
                    }
                }
                if (carry == 1) {
                    sb.insert(0, '1');
                }
            }
        }
        
        return steps;
    }
}