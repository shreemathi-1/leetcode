// Last updated: 4/3/2026, 7:04:15 PM
1class Solution 
2{
3    public int maxSubArray(int[] nums) 
4    {
5        int curSum =0,maxSum = Integer.MIN_VALUE;;
6        for(int i =0;i<nums.length;i++)
7        {
8            curSum = Math.max(curSum + nums[i],nums[i]);
9            maxSum = Math.max(maxSum,curSum);
10        }
11        return maxSum;
12    }
13}