// Last updated: 3/14/2026, 4:08:51 PM
1class Solution 
2{
3    public int lengthOfLongestSubstring(String s) 
4    {
5        int[] freq = new int[256];
6        int l =0;
7        int maxLen =0;
8        for(int r =0;r<s.length();r++)
9        {
10            freq[s.charAt(r)]++;
11            while(freq[s.charAt(r)] >1)
12            {
13                freq[s.charAt(l)]--;
14                l++;
15            }
16            maxLen = Math.max(maxLen,r-l+1);
17        }
18        return maxLen;
19    }
20}