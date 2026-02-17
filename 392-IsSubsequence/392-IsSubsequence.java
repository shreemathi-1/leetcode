// Last updated: 2/17/2026, 9:33:03 PM
1class Solution 
2{
3    public boolean isSubsequence(String s, String t)
4    {
5        if(  s==null || s.length()==0) return true; //s.equals("") instd of 
6        //s.length()==0 can also be used
7        int index =0;
8        for(int it = 0;it < t.length();it++)
9        {
10            if(s.charAt(index) == t.charAt(it))
11            {
12                index++;
13            }
14            if(index == s.length())
15            {
16                return true;
17            }
18        }
19        return false;
20    }
21}        