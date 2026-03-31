// Last updated: 3/31/2026, 10:54:33 PM
1class Solution 
2{
3    public int[] twoSum(int[] nums, int target) 
4    {
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int i =0;i<nums.length;i++)
7        {
8            int diff = target - nums[i];
9            if( map.keySet().contains(diff) )
10            {
11                return new int[]{map.get(diff),i};
12            }
13            map.put(nums[i],i);
14        }
15        return new int[]{-1,-1};
16    }
17}