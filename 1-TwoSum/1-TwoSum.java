// Last updated: 2/18/2026, 8:09:55 PM
1class Solution 
2{
3    public int[] twoSum(int[] nums, int target) 
4    {
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int i =0;i<nums.length;i++)
7        {
8            int diff = target - nums[i];
9            if(map.containsKey(diff))
10            {
11                return new int[]{map.get(diff),i};
12            }
13            else
14            {
15                map.put(nums[i],i);
16            }
17        }
18        return new int[]{-1,-1};
19    }
20}