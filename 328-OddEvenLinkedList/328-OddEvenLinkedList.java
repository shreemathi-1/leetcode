// Last updated: 5/25/2026, 9:07:16 PM
1class Solution 
2{
3    public int subarraySum(int[] nums, int k) 
4    {
5        int c =0;
6        int preSum =0;
7        HashMap<Integer,Integer> map = new HashMap<>();
8        map.put(0,1);
9        for(int i =0;i<nums.length;i++)
10        {
11            preSum += nums[i];
12            int remove = preSum - k;
13            if(map.containsKey(remove))
14            {
15                c += map.get(remove);
16             
17            }
18               map.put(preSum,map.getOrDefault(preSum,0)+1);
19        }
20
21        return c;
22    }
23}