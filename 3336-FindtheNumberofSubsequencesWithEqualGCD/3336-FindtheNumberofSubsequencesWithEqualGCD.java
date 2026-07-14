// Last updated: 7/14/2026, 6:15:59 PM
1class Solution {
2    private static final int MOD = 1_000_000_007;
3
4    public int subsequencePairCount(int[] nums) {
5        int m = 0;
6
7        for (int num : nums) {
8            m = Math.max(m, num);
9        }
10
11        int[][] dp = new int[m + 1][m + 1];
12        dp[0][0] = 1;
13
14        for (int num : nums) {
15            int[][] newDp = new int[m + 1][m + 1];
16
17            for (int gcd1 = 0; gcd1 <= m; gcd1++) {
18                int nextGcd1 = gcd(gcd1, num);
19
20                for (int gcd2 = 0; gcd2 <= m; gcd2++) {
21                    int ways = dp[gcd1][gcd2];
22
23                    if (ways == 0) {
24                        continue;
25                    }
26
27                    int nextGcd2 = gcd(gcd2, num);
28
29                    newDp[gcd1][gcd2] =
30                        (newDp[gcd1][gcd2] + ways) % MOD;
31
32                    newDp[nextGcd1][gcd2] =
33                        (newDp[nextGcd1][gcd2] + ways) % MOD;
34
35                    newDp[gcd1][nextGcd2] =
36                        (newDp[gcd1][nextGcd2] + ways) % MOD;
37                }
38            }
39
40            dp = newDp;
41        }
42
43        int ans = 0;
44
45        for (int gcd = 1; gcd <= m; gcd++) {
46            ans = (ans + dp[gcd][gcd]) % MOD;
47        }
48
49        return ans;
50    }
51
52    private int gcd(int a, int b) {
53        while (b != 0) {
54            int temp = a % b;
55            a = b;
56            b = temp;
57        }
58
59        return a;
60    }
61}