class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0) up=dp[i-1][j];
                if(j>0) left=dp[i][j-1];
                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];
    }
    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     int m=obstacleGrid.length;
    //     int n=obstacleGrid[0].length;
    //     if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
    //     int dp[][]=new int[m][n];
    //     for(int i=0;i<m;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
        
    //     return solve(0,0,obstacleGrid,dp);
    // }
    // private int solve(int i,int j,int grid[][],int[][] dp){
    //     int m=dp.length;
    //     int n=dp[0].length;
    //     if(i>=m || j>=n) return 0;
    //     if(grid[i][j]==1) return 0;
    //     if(i==m-1 && j==n-1) return 1;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int down=solve(i+1,j,grid,dp);
    //     int right=solve(i,j+1,grid,dp);
    //     dp[i][j]=down+right;
    //     return dp[i][j];
    // }
}