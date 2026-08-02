// Last updated: 8/2/2026, 8:22:34 PM
1//translated by AI
2class Solution {
3    public boolean stoneGame(int[] piles) {
4        int n = piles.length;
5        int[][] dp = new int[n][n];
6
7        for (int i = 0; i < n; i++) {
8            dp[i][i] = piles[i];
9        }
10
11        for (int len = 2; len <= n; len++) {
12            for (int i = 0; i + len - 1 < n; i++) {
13                int j = i + len - 1;
14
15                int takeLeft = piles[i] - dp[i + 1][j];
16                int takeRight = piles[j] - dp[i][j - 1];
17
18                dp[i][j] = Math.max(takeLeft, takeRight);
19            }
20        }
21
22        return dp[0][n - 1] > 0;
23    }
24}