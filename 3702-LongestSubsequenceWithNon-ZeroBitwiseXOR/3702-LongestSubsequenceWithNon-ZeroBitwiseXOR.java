// Last updated: 8/15/2026, 12:54:58 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int n = nums.length;
4
5        int[] zeros = new int[n];
6
7        if (Arrays.equals(nums, zeros)) {
8            return 0;
9        }
10
11        int x = 0;
12
13        for (int num : nums) {
14            x ^= num;
15        }
16
17        return x != 0 ? n : n - 1;
18    }
19}