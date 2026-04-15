// Last updated: 4/15/2026, 6:56:59 PM
1class Solution 
2{
3    public int[] sortedSquares(int[] nums) 
4    {
5        int res[] = new int[nums.length];
6        int l = 0, r= nums.length-1;
7        for(int i = nums.length-1;i>=0;i--)
8        {
9            if(Math.abs(nums[l]) >= Math.abs(nums[r]) )
10            {
11                res[i] = nums[l]*nums[l];
12                l++;
13            }
14            else
15            {
16                res[i] = nums[r]*nums[r];
17                r--;
18            }
19        }
20        return res;
21    }
22}