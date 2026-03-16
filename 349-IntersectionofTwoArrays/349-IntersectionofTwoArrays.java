// Last updated: 3/16/2026, 11:29:52 AM
1class Solution 
2{
3    public int[] intersection(int[] nums1, int[] nums2) 
4    {       
5        HashSet<Integer> set = new HashSet<>();
6        HashSet<Integer> resSet = new HashSet<>();
7        for(int num : nums1)
8        {
9            set.add(num);
10        }
11        for(int num : nums2)
12        {
13            if(set.contains(num))
14            {
15               resSet.add (num);
16            }
17        }
18       int[] arr = new int[resSet.size()];
19       int i =0;
20       for(int ele : resSet)
21       {
22            arr[i++] = ele;
23       }
24       return arr;
25    }
26}