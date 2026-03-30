// Last updated: 3/30/2026, 9:35:08 PM
1class Solution 
2{
3    public int lengthOfLongestSubstring(String s) 
4    {
5        LinkedHashSet set = new LinkedHashSet<>();
6        int i =0,max =0,start =0;
7        while(i<s.length())
8        {
9            if(!set.contains(s.charAt(i)))
10            {
11                
12                set.add(s.charAt(i));
13                max = Math.max(max,set.size());
14                i++;
15            }
16            else
17            {
18                set.remove(s.charAt(start));
19                start++;
20            }
21        }
22        return max;
23    }
24}