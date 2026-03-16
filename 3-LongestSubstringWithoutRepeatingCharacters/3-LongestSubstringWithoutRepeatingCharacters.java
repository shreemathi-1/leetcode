// Last updated: 3/16/2026, 2:51:19 PM
1class Solution 
2{
3    public int lengthOfLongestSubstring(String s) 
4    {
5        int l=0;
6        int max = 0;
7       HashSet<Character> set = new HashSet<>();
8        for(int r =0;r<s.length();r++)
9        { 
10          
11            while(set.contains(s.charAt(r)))
12            {
13                set.remove(s.charAt(l));
14                l++;
15            }
16           set.add(s.charAt(r));
17            max = Math.max(max,r-l+1);
18        }
19        return max;
20    }
21}