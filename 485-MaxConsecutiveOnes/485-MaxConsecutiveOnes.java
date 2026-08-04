// Last updated: 8/4/2026, 1:49:57 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) 
3    {
4        int count = 0;
5        int maxCount = 0;
6        if(nums.length == 1)
7        {
8            return nums[0] == 1 ? 1 :0;
9        }
10        for(int i = 0;i<nums.length;i++)
11        {
12            if(nums[i] == 1)
13            {
14                count++;
15                maxCount = Math.max(count, maxCount);
16            }
17            else
18            {
19                count = 0;
20            }
21        }
22        return maxCount;
23    }
24}