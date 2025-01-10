class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;

        int profit = 0;
        int buy = prices[0];
        for(int i = 0; i < prices.length ; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else {
                profit = Math.max(prices[i]-buy, profit);
            }
        }
        return profit;
    }
}