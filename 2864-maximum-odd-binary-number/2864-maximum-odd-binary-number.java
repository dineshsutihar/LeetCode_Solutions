class Solution {
    public String maximumOddBinaryNumber(String s) {
        int N = s.length();
        
        int ones_cnt = 0;
        for (int i = 0; i < N; i++) {
            ones_cnt += s.charAt(i) - '0';
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ones_cnt - 1; i++) {
            sb.append("1");
        }
        for (int i = 0; i < N - ones_cnt; i++) {
            sb.append("0");
        }
        sb.append("1");

        return sb.toString();
    }
}