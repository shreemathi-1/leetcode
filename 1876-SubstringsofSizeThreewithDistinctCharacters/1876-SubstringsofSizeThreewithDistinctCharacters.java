// Last updated: 7/9/2026, 6:42:43 AM
1class Solution {
2    public int countGoodSubstrings(String s) {
3
4        int left = 0;
5        int k = 3;
6        int c = 0;
7        HashMap<Character, Integer> map = new HashMap<>();
8        for(int r =0;r < s.length();r++)
9        {
10            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0) +1 );
11            if(r-left +1 == k)
12            {
13               if( map.size() == k)
14               {
15                    c++;
16               }
17               map.put(s.charAt(left),map.get(s.charAt(left)) -1 );
18               if(map.get(s.charAt(left)) == 0)
19               {
20                map.remove(s.charAt(left));
21               }
22               left++;
23            }
24
25        }
26        return c;
27    }
28}