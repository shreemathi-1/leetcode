// Last updated: 7/2/2026, 10:44:52 PM
1class Solution 
2{
3    public int numSubarraysWithSum(int[] nums, int goal) 
4    {
5        HashMap<Integer,Integer> map = new HashMap<>();
6        int count = 0;
7        int prefSum = 0,rem = 0;
8        map.put(0,1);
9        for(int i =0;i<nums.length;i++)
10        {
11            prefSum += nums[i];
12            rem = prefSum - goal;
13            if(map.containsKey(rem))
14            {
15                count += map.get(rem);
16            }
17            map.put(prefSum , map.getOrDefault(prefSum ,0 )+1);
18        }
19        return count;
20    }
21}