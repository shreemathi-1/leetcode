// Last updated: 7/1/2026, 6:15:50 PM
1class Solution 
2{
3    public int lengthOfLongestSubstring(String s) 
4    {
5        HashSet<Character> set = new HashSet<>();
6        int left =0;
7        int max = 0;
8        for(int r =0;r<s.length();r++)
9        {
10            while(set.contains(s.charAt(r)))
11            {
12                set.remove(s.charAt(left));
13                left++;
14            }
15             set.add(s.charAt(r));
16            max = Math.max(max,r-left+1);
17        }
18    return max;
19    }
20}