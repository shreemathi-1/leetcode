// Last updated: 4/5/2026, 11:53:49 AM
1class Solution 
2{
3    public void moveZeroes(int[] nums) 
4    {
5        int j =0;
6        for(int i =0;i<nums.length;i++)
7        {
8            if(nums[i] != 0 )
9            {
10                if(i !=j)
11                {
12                    nums[j] = nums[i];
13                }
14                j++;
15            }
16        }
17        for(int i =j;i<nums.length;i++)
18        {
19            nums[i] = 0;
20        }
21    }
22}