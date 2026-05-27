// Last updated: 5/27/2026, 7:47:20 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j =0;
4        for(int i =0;i<nums.length;i++)
5        {
6            if(nums[i] != 0 )
7            {
8                nums[j++] = nums[i];
9            }
10        }
11        for( int i =j;i<nums.length;i++)
12        {
13            nums[i] = 0;
14        }
15    }
16}