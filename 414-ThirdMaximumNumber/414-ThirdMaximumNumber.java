// Last updated: 4/15/2026, 8:55:16 PM
1class Solution 
2{
3    public boolean isAnagram(String s, String t) 
4    {
5        if(s.length() != t.length())
6        {
7            return false;
8        }
9        char[] arr1 = s.toCharArray();
10        char[] arr2 = t.toCharArray();
11        Arrays.sort(arr1);
12        Arrays.sort(arr2);
13        for(int i =0;i<arr1.length;i++)
14        {
15            if(arr1[i] != arr2[i])
16            {
17                return false;
18            }
19        }
20        return true;
21    }
22}