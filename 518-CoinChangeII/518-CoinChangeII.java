// Last updated: 6/1/2026, 8:32:35 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int len = nums.length, count = 1;
4        int[] dp = new int[len];
5        Arrays.fill(dp, 1);
6        for(int i = 1; i<len; i++){
7            for(int j = 0; j<i; j++){
8                if(nums[j]<nums[i]){
9                    dp[i] = Math.max(dp[i], dp[j]+1);
10                }
11            }
12            count = Math.max(count, dp[i]);
13        }
14        return count;
15    }
16}