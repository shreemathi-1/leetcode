// Last updated: 8/10/2026, 6:16:04 PM
1class Solution {
2    public boolean winnerSquareGame(int n) {
3
4        boolean[] dp = new boolean[n + 1];
5
6        for (int i = 0; i <= n; i++) {
7
8            if (!dp[i]) {
9
10                for (int j = 1; i + j * j <= n; j++) {
11                    dp[i + j * j] = true;
12                }
13                if (dp[n]) {
14                    return true;
15                }
16            }
17        }
18
19        return false;
20    }
21}