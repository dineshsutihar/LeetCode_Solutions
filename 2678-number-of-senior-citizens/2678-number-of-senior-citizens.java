class Solution {
    public int countSeniors(String[] details) {
        int count = 0; 
        for(String detail: details){
            int firstDigit = detail.charAt(11)-'0';
            int secondDigit = detail.charAt(12)-'0';
            int total = firstDigit*10 + secondDigit;
            if(total>60) count++;

        }
        return count; 
    }
}