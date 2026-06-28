// Last updated: 6/28/2026, 5:42:55 PM
1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        int n = arr.length;
4        int cnt[] = new int[n + 1];
5
6        for (int i = 0; i < n; i++) {
7            cnt[Math.min(arr[i], n)]++;
8        }
9
10        int val = 0;
11        for (int i = 1; i <= n; i++) {
12            val = Math.min(i, val + cnt[i]);
13        }
14
15        return val;
16    }
17}