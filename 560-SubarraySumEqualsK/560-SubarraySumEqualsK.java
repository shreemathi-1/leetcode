// Last updated: 7/2/2026, 6:19:32 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int count =0;
5        int prefSum =0 , rem = 0;
6        map.put(0,1);
7        for(int i =0;i<nums.length;i++)
8        {
9            prefSum += nums[i];
10            rem = prefSum - k;
11            if(map.containsKey(rem))
12            {
13                count += map.get(rem);
14            }
15            map.put(prefSum , map.getOrDefault(prefSum , 0) +1 );
16        }
17        return count;
18    }
19}