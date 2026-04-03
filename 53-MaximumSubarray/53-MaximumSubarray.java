// Last updated: 4/3/2026, 7:01:24 PM
1class Solution 
2{
3    public int maxSubArray(int[] nums) 
4    {
5        int curSum =nums[0],maxSum =nums[0];
6        for(int i =1;i<nums.length;i++)
7        {
8            curSum = Math.max(curSum + nums[i],nums[i]);
9            maxSum = Math.max(maxSum,curSum);
10        }
11        return maxSum;
12    }
13}