// Last updated: 5/28/2026, 10:37:19 AM
1class Solution 
2{
3    public int[] twoSum(int[] nums, int target) 
4    {
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int i =0;i<nums.length;i++)
7        {
8            int diff = target - nums[i];
9            if(!map.containsKey(diff))
10            {
11                map.put(nums[i],i);
12            }
13            else
14            {
15                return new int[]{map.get(diff),i};
16            }
17        }
18        return new int[]{-1,-1};
19    }
20}