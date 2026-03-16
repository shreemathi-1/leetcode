// Last updated: 3/16/2026, 11:27:18 AM
1class Solution 
2{
3    public int[] intersection(int[] nums1, int[] nums2) 
4    {       
5        HashSet<Integer> set1 = new HashSet<>();
6        HashSet<Integer> set2 = new HashSet<>();
7        for(int i =0;i<nums1.length;i++)
8        {
9            set1.add(nums1[i]);
10        }
11        for(int j =0;j<nums2.length;j++)
12        {
13            if(set1.contains(nums2[j]))
14            {
15               set2.add (nums2[j]);
16            }
17        }
18       int[] arr = new int[set2.size()];
19       int i =0;
20       for(int ele : set2)
21       {
22            arr[i++] = ele;
23       }
24       return arr;
25    }
26}