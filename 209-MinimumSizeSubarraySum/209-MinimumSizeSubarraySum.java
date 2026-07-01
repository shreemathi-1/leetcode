// Last updated: 7/1/2026, 3:58:04 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left =0;
4        int sum =0;
5        int min = Integer.MAX_VALUE;
6        for(int r =0;r<nums.length;r++)
7        {
8            sum  += nums[r];
9            while(sum >= target)
10            {
11                min = Math.min(min, r-left+1);
12                sum -= nums[left];
13                left++;
14            }
15        }
16        return min == Integer.MAX_VALUE ?  0 : min;
17    }
18}