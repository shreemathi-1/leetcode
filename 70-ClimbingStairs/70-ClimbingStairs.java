// Last updated: 6/1/2026, 12:20:33 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if(n==0) return 0;
5        if(n==1) return nums[0];
6        int[] dp = new int[n];
7        dp[0] = nums[0];
8        dp[1] = Math.max(nums[0],nums[1]);
9        for(int i =2;i<n;i++)
10        {
11            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
12        }
13        return dp[n-1];
14    }
15}