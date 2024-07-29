class Solution {
    public int numTeams(int[] rating) {
        int lengthOfRating = rating.length; 

        int count = 0; 
        for (int i = 0; i < lengthOfRating - 2; i++) {
            for (int j = i + 1; j < lengthOfRating - 1; j++) {
                for (int k = j + 1; k < lengthOfRating; k++) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k]) || 
                        (rating[i] > rating[j] && rating[j] > rating[k])) {
                        count++; 
                    }
                }
            }
        }
        return count; 
    }
}
