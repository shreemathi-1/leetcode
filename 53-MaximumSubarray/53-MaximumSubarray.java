// Last updated: 4/4/2026, 10:25:44 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curSum =0,maxSum =Integer.MIN_VALUE;
4        for(int i =0;i<nums.length;i++)
5        {
6            curSum = Math.max(nums[i], curSum+nums[i]);
7            maxSum = Math.max(curSum,maxSum);
8        }
9        return maxSum;
10    }
11}