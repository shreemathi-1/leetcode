// Last updated: 3/29/2026, 11:20:29 PM
1class Solution 
2{
3    public int lengthOfLongestSubstring(String s) 
4    {
5        // if(s.length() ==1) return 1;
6        int max =0,len =0,i=0,start =0;
7        HashSet<Character> set = new HashSet<>();
8        while(i < s.length())
9        {
10            if(!set.contains(s.charAt(i)))
11            {  
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