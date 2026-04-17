// Last updated: 4/17/2026, 11:35:05 AM
1class Solution 
2{
3    public void reverseString(char[] s) 
4    {
5        int l = 0 , r = s.length-1;
6        while(l<r)
7        {
8            char temp = s[l];
9            s[l] = s[r];
10            s[r] = temp;
11            l++;
12            r--;
13        }
14    }
15}