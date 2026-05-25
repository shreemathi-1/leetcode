// Last updated: 5/25/2026, 9:10:42 PM
1class Solution 
2{
3    public int[] topKFrequent(int[] nums, int k) 
4    {
5        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();  
6          
7
8        for(int i =0;i<nums.length;i++)
9        {
10            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
11        }
12       
13        List<Map.Entry<Integer, Integer>> list =
14                new ArrayList<>(map.entrySet());
15
16        list.sort((a, b) -> b.getValue() - a.getValue());
17
18        int[] result = new int[k];
19        for (int i = 0; i < k; i++) {
20            result[i] = list.get(i).getKey();
21        }
22
23        return result;
24    }
25}
26