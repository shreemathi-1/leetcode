// Last updated: 8/14/2026, 10:46:14 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int left =0;
4        int maxLen = 0;
5        HashMap<Character,Integer> map = new HashMap<>();
6        for(int r =0;r<s.length();r++)
7        {
8            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
9            while(map.get(s.charAt(r)) >2)
10            {
11                map.put(s.charAt(left), map.get(s.charAt(left))-1);
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