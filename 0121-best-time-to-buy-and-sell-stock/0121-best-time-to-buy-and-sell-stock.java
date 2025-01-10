class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;

        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length ; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            if(profit < prices[i] - buy){
                profit =  prices[i] - buy;
            }
        }
        return profit;
    }
}