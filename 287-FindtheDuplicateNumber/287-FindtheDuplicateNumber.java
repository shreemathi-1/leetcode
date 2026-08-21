// Last updated: 8/21/2026, 11:45:42 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int num : nums)
5        {
6            if(set.contains(num))
7            {
8                return num;
9            }
10            set.add(num);
11        }
12        return -1;
13    }
14}