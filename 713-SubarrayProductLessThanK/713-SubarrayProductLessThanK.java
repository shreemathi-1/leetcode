// Last updated: 6/5/2026, 5:43:34 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if (k <= 1) return 0;
4
5        int left = 0, right = 0, product = 1, count = 0;
6        int n = nums.length;
7
8        while (right < n) {
9            product *= nums[right];
10            while (product >= k) product /= nums[left++];
11            count += 1 + (right - left);
12            right++;
13        }
14
15        return count;
16    }
17}