// Last updated: 3/29/2026, 8:05:30 AM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int st =0;
4        int e = s.length()-1;
5        while(st<=e)
6        { 
7            if(s.charAt(st) == s.charAt(e))
8            {
9                return st;
10            }
11            st++;
12            e--;
13        }
14        return -1;
15    }
16}