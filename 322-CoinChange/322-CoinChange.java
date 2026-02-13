// Last updated: 2/13/2026, 3:16:16 PM

class Solution
 {
    public int coinChange(int[] coins, int amount)
     {
        int n = coins.length;
        int dp[] = new int[amount+1]; 
      
        Arrays.fill(dp,Integer.MAX_VALUE);
  dp[0] =0;
        for(int x =1;x<dp.length;x++)
        {
            for(int c:coins)
            {
                if(x >= c && dp[x-c] != Integer.MAX_VALUE)
                {
                    dp[x] = Math.min(dp[x],dp[x-c]+1) ;
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1: dp[amount];
    }
}