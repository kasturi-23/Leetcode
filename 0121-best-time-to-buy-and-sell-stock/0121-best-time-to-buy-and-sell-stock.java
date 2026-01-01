class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];   // keep minimum price
            }

            int temp = prices[i] - buy; // profit if sold today

            if (temp > result) {
                result = temp;     // update max profit
            }
        }
        return result;
    }
}
