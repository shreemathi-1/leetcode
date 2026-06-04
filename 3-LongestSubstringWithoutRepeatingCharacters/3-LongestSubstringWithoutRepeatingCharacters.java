// Last updated: 6/4/2026, 10:20:45 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int ws=0,max =0;
4        int[] freq = new int[256];
5        for(int we =0;we < s.length();we++)
6        {
7            freq[s.charAt(we)]++;
8            while(freq[s.charAt(we)] > 1)
9            {
10                freq[s.charAt(ws)]--;
11                ws++;
12            }
13            max = Math.max(max,we - ws + 1);
14        }
15        return max;
16    }
17}