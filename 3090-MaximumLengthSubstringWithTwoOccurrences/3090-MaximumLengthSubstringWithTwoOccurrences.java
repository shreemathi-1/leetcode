// Last updated: 8/14/2026, 12:00:22 PM
1class Solution {
2    public boolean isGood(int[] nums) {
3        int n = 0;
4        for (int x : nums) n = Math.max(n, x);
5
6        if(nums.length != n + 1) return false;
7
8        int[] freq = new int[n + 1];
9        for (int x : nums) freq[x]++;
10
11        for (int v = 1; v < n; v++) {
12            if (freq[v] != 1) return false;
13        }
14
15        return freq[n] == 2;
16    }
17}