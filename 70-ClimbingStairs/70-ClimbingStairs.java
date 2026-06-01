// Last updated: 6/1/2026, 11:27:05 AM
1class Solution {
2    public int climbStairs(int n) {
3        if(n<=2) return n;
4        int dp[] = new int[n+1];        
5        dp[1] = 1;
6        dp[2] = 2;
7        for(int i =3;i<=n;i++)
8        {
9            dp[i] = dp[i-1] + dp[i-2];
10        }
11        return dp[n];
12    }
13}