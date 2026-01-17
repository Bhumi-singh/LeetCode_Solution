class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int num : nums) total += num;

        if (total < Math.abs(target) || (total + target) % 2 != 0)
            return 0;
            
        int P = (total + target) / 2;

        int[] dp = new int[P + 1];
        dp[0] = 1; 

        for (int num : nums) {
            for (int j = P; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[P];
    }
}
