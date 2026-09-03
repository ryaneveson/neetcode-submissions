class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int right = 0; right < prices.length; right++){
            if(min >= prices[right]){
                min = prices[right];
            }
            profit = Math.max(profit, prices[right] - min);
        }
        return profit;
    }
}
