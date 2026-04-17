// Last updated: 4/17/2026, 11:41:44 AM
1class Solution 
2{
3    public int firstUniqChar(String s) 
4    {
5        int[] freq = new int[26];
6        for(int i =0;i<s.length();i++)
7        {
8            freq[s.charAt(i) - 'a']++;
9        }
10        for(int i =0;i< s.length();i++)
11        {
12            if(freq[s.charAt(i)- 'a'] ==1)
13            {
14                return i;
15            }
16        }
17        return -1;
18    }
19}