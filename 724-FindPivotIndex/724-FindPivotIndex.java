// Last updated: 3/6/2026, 6:54:17 AM
1class Solution
2 {
3    public int pivotIndex(int[] nums) 
4    {
5        int total =0;
6         for(int i =0;i<nums.length;i++)
7         {
8            total += nums[i]; 
9         }
10     
11        int leftSum = 0, rightSum = 0;
12        for(int i =0;i<nums.length;i++)
13        {
14          
15            rightSum = total - leftSum - nums[i];
16            if(leftSum == rightSum)
17            {
18                
19                return i;
20            }
21              leftSum += nums[i];
22        }
23        return -1;
24    }
25}