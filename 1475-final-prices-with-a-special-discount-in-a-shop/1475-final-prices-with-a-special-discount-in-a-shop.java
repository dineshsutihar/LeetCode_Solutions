class Solution {

    public int[] finalPrices(int[] prices) {
        int[] result = prices.clone();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                result[stack.pop()] -= prices[i];
            }
            stack.add(i);
        }

        return result;
    }
}