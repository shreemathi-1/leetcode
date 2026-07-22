// Last updated: 7/22/2026, 10:26:04 PM
1class Solution 
2{
3    public int subarraySum(int[] nums, int k) 
4    {
5        int count =0;
6        int sum = 0;
7        HashMap<Integer,Integer> map = new HashMap<>();
8        map.put(0,1);
9        for(int i = 0;i<nums.length;i++)
10        {
11            sum += nums[i];
12            if(map.containsKey(sum-k) )
13            {
14                count += map.get(sum-k);
15            }
16            map.put(sum, map.getOrDefault(sum,0)+1);
17        }
18        return count;
19    }
20}