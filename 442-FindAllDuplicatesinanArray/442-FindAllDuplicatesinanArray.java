// Last updated: 5/30/2026, 6:48:49 PM
1class Solution 
2{
3    public List<Integer> findDuplicates(int[] nums) 
4    {
5        ArrayList<Integer> l = new ArrayList<>();
6        int n = nums.length;
7        HashSet<Integer> set = new HashSet<>();
8        if(n ==0 || n==1)
9        {
10            return l;
11        }
12        
13        for(int i=0;i<n;i++)
14        {
15            if(set.contains(nums[i]))
16            {
17                l.add(nums[i]);
18            }
19            set.add(nums[i]);
20        }
21        return l;
22    }
23}