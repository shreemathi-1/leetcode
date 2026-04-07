// Last updated: 4/7/2026, 8:41:53 PM
1class Solution 
2{
3    public int removeDuplicates(int[] nums) 
4    {
5        int i =0;
6        for(int j =0;j<nums.length;j++ )
7        {
8            if( nums[i] != nums[j] && i != j)
9            {
10                nums[++i] = nums[j]; 
11            }
12        }
13        return i+1;
14    }
15}