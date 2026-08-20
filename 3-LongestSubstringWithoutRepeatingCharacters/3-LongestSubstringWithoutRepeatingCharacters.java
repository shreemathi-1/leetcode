// Last updated: 8/20/2026, 4:08:44 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        int left = 0, maxLen = 0;
5        for(int r = 0;r<s.length();r++)
6        {
7            char ch = s.charAt(r);
8            map.put(ch, map.getOrDefault(ch,0)+1);
9            while(map.get(ch) > 1)
10            {
11                map.put(s.charAt(left),map.get(s.charAt(left))-1);
12                if(map.get(s.charAt(left)) == 0)
13                {
14                    map.remove(s.charAt(left));
15                }
16                left++;
17            }
18            maxLen = Math.max(maxLen,r - left +1);
19        }
20        return maxLen;
21    }
22}