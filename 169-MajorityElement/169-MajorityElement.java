// Last updated: 4/8/2026, 8:54:07 PM
1class Solution 
2{
3    public int majorityElement(int[] nums) 
4    {
5        int maj = nums[0];
6        int c =0;
7        for(int i =0;i<nums.length;i++)
8        {
9            if(c==0 )
10            {
11                maj = nums[i];
12            }
13            if(nums[i] == maj)
14            {
15                c++;
16            }
17            else
18            {
19                c--;
20            }
21        }
22        return maj;
23    }
24}