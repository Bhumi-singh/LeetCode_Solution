class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            int cost=prices[i]-min;
            maxprofit=Math.max(maxprofit,cost);
            min=Math.min(prices[i],min);
        }
        return maxprofit;
    }
}