// Last updated: 7/2/2026, 10:16:01 AM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int[] runSum = new int[nums.length];
4        runSum[0] = nums[0];
5        for(int i =1;i<nums.length;i++)
6        {
7            runSum[i] = runSum[i-1] + nums[i];
8        }
9        return runSum;
10    }
11}