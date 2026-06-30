// Last updated: 6/30/2026, 8:49:12 PM
1class Solution {
2    public int maxSubArray(int[] nums) { 
3        int max = Integer.MIN_VALUE;
4        int sum = 0;
5        for(int i =0;i<nums.length;i++)
6        {
7            sum += nums[i];
8            max = Math.max(max, sum);
9            if(sum < 0) sum =0;
10        }
11        return max;
12    }
13}