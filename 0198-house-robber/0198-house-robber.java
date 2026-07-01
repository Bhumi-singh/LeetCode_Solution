class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        if(n==1) return nums[0];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int rob=nums[i]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(rob,skip);
        }
        return dp[n-1];
    //     int n=nums.length;
    //     int dp[]=new int[n];
    //     Arrays.fill(dp,-1);
    //     return solve(nums,n-1,dp);
    // }
    // private int solve(int nums[],int n,int dp[]){
    //     if(n<0) return 0;
    //     if(n==0) return nums[0];
    //     if(dp[n]!=-1) return dp[n];
    //     int rob=nums[n]+solve(nums,n-2,dp);
    //     int skip=solve(nums,n-1,dp);
    //     return Math.max(rob,skip);
    
    }
}