class Solution {
    Integer dp[][][];
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new Integer[n][2][3];
        return solve(0,1,2,prices);
    }

    private int solve(int idx,int buy,int cap,int prices[]){
        if(idx==prices.length || cap==0) return 0;
        if(dp[idx][buy][cap]!=null) return dp[idx][buy][cap];
        int profit;
        if(buy==1){
            int buyToday=-prices[idx]+solve(idx+1,0,cap,prices);
            int skip=solve(idx+1,1,cap,prices);
            profit=Math.max(buyToday,skip);
        }else{
            int sellToday=prices[idx]+solve(idx+1,1,cap-1,prices);
            int wait=solve(idx+1,0,cap,prices);
            profit=Math.max(sellToday,wait);
        }
        return dp[idx][buy][cap] = profit;
    }
}