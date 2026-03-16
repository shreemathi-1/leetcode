// Last updated: 3/16/2026, 10:27:32 AM
1class Solution 
2{
3    public boolean containsDuplicate(int[] nums) 
4    {
5        HashSet<Integer> set = new HashSet<>();
6        for(int num : nums)
7        {
8            if(!set.add(num))
9            {
10                return true;
11            }
12        }
13        return false;
14    }
15}