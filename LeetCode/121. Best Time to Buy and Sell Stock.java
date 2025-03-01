class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int i=1;i<prices.length;i++)
        {
            if (prices[i]<=buy)
            {
                buy = prices [i];
                continue;
            }
            profit = Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}
