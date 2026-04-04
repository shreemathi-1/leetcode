// Last updated: 4/4/2026, 3:57:06 PM
1class Solution 
2{
3    public boolean containsDuplicate(int[] nums) 
4    {
5        HashSet<Integer> set = new HashSet<>();
6        for(int i =0;i<nums.length;i++)
7        {
8            if(set.contains(nums[i]))
9            {
10                return true;
11            }
12            else
13            {
14                set.add(nums[i]);
15            }
16        }
17        return false;
18    }
19}