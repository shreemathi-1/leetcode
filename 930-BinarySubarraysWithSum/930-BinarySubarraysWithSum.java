// Last updated: 7/2/2026, 10:43:58 PM
1class Solution 
2{
3    public int numSubarraysWithSum(int[] nums, int goal) 
4    {
5        HashMap<Integer,Integer> map = new HashMap<>();
6        int count = 0;
7        int prefSum = 0,rem = 0;
8        for(int i =0;i<nums.length;i++)
9        {
10            prefSum += nums[i];
11            rem = prefSum - goal;
12            if(prefSum == goal)
13            {
14                count++;
15            }
16            if(map.containsKey(rem))
17            {
18                count += map.get(rem);
19            }
20            map.put(prefSum , map.getOrDefault(prefSum ,0 )+1);
21        }
22        return count;
23    }
24}