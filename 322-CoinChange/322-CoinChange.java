// Last updated: 6/1/2026, 3:00:15 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] dp = new int[amount+1];
4        Arrays.fill(dp,amount +1);
5        dp[0] = 0;
6        for(int coin : coins)
7        {
8            for(int i =coin;i<=amount;i++)
9            {
10                dp[i] = Math.min(dp[i],dp[i-coin]+1);
11            }
12        }
13        if(dp[amount] > amount)
14        {
15            return -1;
16        }
17        else
18        {
19            return dp[amount];
20        }
21    }
22}