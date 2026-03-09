// Last updated: 3/9/2026, 2:34:46 PM
1class Solution 
2{
3    public int lengthOfLongestSubstring(String s) 
4    {
5        int[] freq = new int[256];
6        int left =0;
7        int max =0;
8        for(int r =0;r<s.length();r++)
9        {
10            freq[s.charAt(r)]++;
11            while(freq[s.charAt(r)] >1)
12          {
13            freq[s.charAt(left)]--;
14            left++;
15          }
16         max = Math.max(max,r-left+1);
17        
18        }
19        return max;
20       
21    }
22}