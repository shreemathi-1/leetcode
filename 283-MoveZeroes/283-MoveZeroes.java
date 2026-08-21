// Last updated: 8/21/2026, 12:32:16 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int ind = 0;
4        for(int i =0;i<nums.length;i++)
5        {
6            if(nums[i] != 0)
7            {
8                int temp = nums[i];
9                nums[i] = nums[ind];
10                nums[ind] = temp;
11                ind++;
12            }
13        }
14
15    }
16}