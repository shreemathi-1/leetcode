// Last updated: 5/25/2026, 9:14:24 PM
1class Solution 
2{
3    public int climbStairs(int n) 
4    {
5        int[] dp = new int[n+1];
6        dp[0]=1;
7        dp[1] =1;
8        for(int i =2;i<n+1;i++)
9        {
10            dp[i]= dp[i-1] + dp[i-2];
11        }
12        return dp[n];
13    }
14}