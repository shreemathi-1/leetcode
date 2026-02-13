// Last updated: 2/13/2026, 3:16:11 PM
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();  
          

        for(int i =0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}

