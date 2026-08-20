// Last updated: 8/20/2026, 4:23:52 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length())
4        {
5            return false;
6        }
7        int[] freq = new int[26];
8        for(int i =0;i<s.length();i++)
9        {
10            freq[s.charAt(i) - 'a']++;
11            freq[t.charAt(i) - 'a']--;
12        }
13        for(int i =0;i<freq.length;i++)
14        {
15            if(freq[i] != 0)
16            {
17                return false;
18            }
19        }
20        return true;
21    }
22}