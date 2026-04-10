// Last updated: 4/10/2026, 3:11:46 PM
1class Solution 
2{
3    public int pivotIndex(int[] nums) 
4    {
5        int leftSum =0,total =0;
6        for(int i =0;i<nums.length;i++)
7        {
8            total += nums[i];
9        }
10        for(int i =0;i<nums.length;i++)
11        { 
12            int rightSum = total - leftSum - nums[i];
13            if(leftSum==rightSum)
14            {
15                return i;
16            }
17            leftSum += nums[i];
18        }
19        return -1;
20    }
21}