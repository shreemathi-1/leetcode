// Last updated: 8/21/2026, 11:42:01 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int i =0;i<nums.length;i++)
5        {
6            int comp = target - nums[i];
7            if(map.containsKey(comp))
8            {
9                return new int[] {map.get(comp),i};
10            }
11            map.put(nums[i],i);
12        }
13        return new int[]{-1,-1};
14    }
15}