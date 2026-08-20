// Last updated: 8/21/2026, 12:17:56 AM
1class Solution {
2    public int compress(char[] chars) {
3        int ind =0 ;
4        int i =0;
5        while(i < chars.length)
6        {
7            int count =0;
8            char cur = chars[i];
9            while(i < chars.length && chars[i] == cur)
10            {
11                count++;
12                i++;
13            }
14            chars[ind++] = cur;
15            if(count > 1)
16            {
17                String s = "" + count;
18                for(char dig : s.toCharArray())
19                {
20                    chars[ind++] = dig;
21                }
22            }
23
24        }
25        return ind;
26    }
27}