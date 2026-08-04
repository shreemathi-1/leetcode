// Last updated: 8/4/2026, 2:04:33 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        ArrayList<Integer> res = new ArrayList<>();
4        HashSet<Integer> set = new HashSet<>();
5        int min = Integer.MAX_VALUE;
6        int max = Integer.MIN_VALUE;
7        for(int i =0;i<nums.length;i++)
8        {
9            set.add(nums[i]);
10            if(nums[i] > max)
11                max = nums[i];
12            if(nums[i] < min) 
13                min = nums[i];   
14        }
15        for(int i = min;i <= max;i++)
16        {
17            if(!set.contains(i))
18            {
19                res.add(i);
20            }
21        }
22        return res;
23    }
24}