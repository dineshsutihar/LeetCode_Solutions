class Solution {
    public double averageWaitingTime(int[][] customers) {
        int N = customers.length;  
        double serviceTime = customers[0][0] + customers[0][1];
        double totalWait = serviceTime - customers[0][0];

        for (int i = 1; i < N; i++) {
            if (serviceTime < customers[i][0]) {
                serviceTime = customers[i][0];
            }
            serviceTime += customers[i][1];
            totalWait += (serviceTime - customers[i][0]);
        }
        return totalWait / N;
    }
}