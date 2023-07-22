public class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] memo = new Integer[prices.length + 1][2];

        return dfs(prices, 0, 0, memo);
    }

    private int dfs(int[] prices, int i, int ableToSell, Integer[][] memo) {
        if (memo[i][ableToSell] != null) {
            return memo[i][ableToSell];
        }
        if (i == prices.length) {
            return 0;
        }

        int profit = 0;

        if (ableToSell == 0) {
            int buy = dfs(prices, i + 1, 1, memo) - prices[i];
            int doNothing = dfs(prices, i + 1, 0, memo);
            profit = Math.max(buy, doNothing);
        }

        if (ableToSell == 1) {
            int sell = dfs(prices, i + 1, 0, memo) + prices[i];
            int doNothing = dfs(prices, i + 1, 1, memo);
            profit = Math.max(sell, doNothing);
        }

        memo[i][ableToSell] = profit;

        return profit;
    }
}
