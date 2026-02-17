// Last updated: 2/17/2026, 9:27:51 PM
1class Solution 
2{
3    public boolean isSubsequence(String s, String t)
4    {
5        if(s=="" || s==null || s.length()==0) return true;
6        int index =0;
7        for(int it = 0;it < t.length();it++)
8        {
9            if(s.charAt(index) == t.charAt(it))
10            {
11                index++;
12            }
13            if(index == s.length())
14            {
15                return true;
16            }
17        }
18        return false;
19    }
20}        