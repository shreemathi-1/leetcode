// Last updated: 6/2/2026, 12:05:56 PM
1class Solution {
2    public int longestCommonSubsequence(String s1, String s2) {
3          int l1 = s1.length();
4        int l2 = s2.length();
5        int[][] dp = new int[l1+1][l2+1];
6        for(int i =1;i<=l1;i++)
7        {
8            for(int j =1;j<=l2;j++)
9            {
10                if(s1.charAt(i-1) == s2.charAt(j-1))
11                {
12                    dp[i][j] = dp[i-1][j-1] +1;
13                }
14                else
15                {
16                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
17                }
18            }
19        }
20        return dp[l1][l2];
21    }
22}