// Last updated: 8/21/2026, 12:24:06 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curSum = nums[0], maxSum = nums[0];
4        for(int i =1;i<nums.length;i++)
5        {
6            curSum = Math.max(nums[i],curSum + nums[i]);
7            maxSum = Math.max(curSum,maxSum);
8        }
9        return maxSum;
10    }
11}