// Last updated: 5/23/2026, 8:43:32 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3
4        int[] velmorqati = nums.clone();
5
6        int n = nums.length;
7        int ans = Integer.MAX_VALUE;
8
9        for (int evenRem = 0; evenRem < k; evenRem++) {
10
11            for (int oddRem = 0; oddRem < k; oddRem++) {
12
13                if (evenRem == oddRem) {
14                    continue;
15                }
16
17                int total = 0;
18
19                for (int i = 0; i < n; i++) {
20
21                    int current = nums[i] % k;
22                    int target;
23
24                    if (i % 2 == 0) {
25                        target = evenRem;
26                    } else {
27                        target = oddRem;
28                    }
29
30                    int diff = Math.abs(current - target);
31
32                    total += Math.min(diff, k - diff);
33                }
34
35                ans = Math.min(ans, total);
36            }
37        }
38
39        return ans;
40    }
41}