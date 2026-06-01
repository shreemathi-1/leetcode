// Last updated: 6/1/2026, 8:18:30 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[] dp = new int[amount+1];
4        dp[0] = 1;
5        for(int coin : coins)
6        {
7            for(int i=coin;i<=amount;i++)
8            {
9                dp[i] += dp[i - coin];
10            }
11        }
12        return dp[amount];
13    }
14}
15
16// public class Solution {
17//     public int change(int amount, int[] coins) {
18//         int[] dp = new int[amount + 1];
19//         dp[0] = 1;
20        
21//         for (int coin : coins) {
22//             for (int j = coin; j <= amount; j++) {
23//                 dp[j] += dp[j - coin];
24//             }
25//         }
26        
27//         return dp[amount];
28//     }
29// }