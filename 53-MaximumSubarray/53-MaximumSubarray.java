// Last updated: 6/10/2026, 9:31:07 PM
1class Solution {
2    public int maxSubArray(int[] nums) 
3    {
4        int curSum = 0,maxSum =Integer.MIN_VALUE;
5        for(int i =0;i<nums.length;i++)
6        {
7            curSum = Math.max(nums[i],nums[i]+ curSum) ;
8            maxSum = Math.max(curSum,maxSum);
9        }
10        return maxSum;
11    }
12}